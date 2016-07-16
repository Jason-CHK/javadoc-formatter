#!/usr/bin/env python

__author__ = "Jason Cheng"

import urllib
import re
import sys
import os

if len(sys.argv) != 2:
	print 'Wrong arguments. Argument: URL of class javadoc'
	exit(0)

javadoc_url = sys.argv[1]
class_end = javadoc_url.rfind('.html')
class_start = javadoc_url[:class_end].rfind('/') + 1
class_name = javadoc_url[class_start:class_end]
file_path = os.path.dirname(os.path.abspath(__file__)) + '/' + class_name + '.java'

tab = '    '

sock = urllib.urlopen(javadoc_url)
html = sock.read()
sock.close()


def process_raw(raw):
	raw = re.sub('\t+', ' ', raw)
	raw = re.sub(r'<.*?>', '', raw)
	raw = raw.replace('&nbsp;', ' ')
	raw = raw.replace('&lt;', '<')
	raw = raw.replace('&gt;', '>')
	return raw


def get_method(pos):
	pos = html.find('<pre>', pos)
	if pos == -1:
		return '', pos
	method = process_raw(html[pos + 5:html.find('</pre>', pos)])
	method = re.sub('\s+', ' ', method)
	pos = html.find('</pre>', pos) + len('</pre>')
	return method, pos


def get_exp(pos):
	exp = ''
	if html[pos] == '\n':
		pos += 1
	if html[pos:pos + len('<div class="block">')] == '<div class="block">':
		pos += len('<div class="block">')
		exp = process_raw(html[pos:html.find('</div>', pos)])
	return exp, pos


def get_params(pos):
	end = html.find('</li>', pos)
	params = dict()
	while True:
		next_pos = html.find('<span class="paramLabel">', pos)
		if next_pos > end or next_pos == -1:
			break
		pos = html.find('<code>', next_pos) + len('<code>')
		param_name = html[pos:html.find('</code>', pos)]
		pos = html.find('</code>', pos) + len('</code>')
		param_explanation = html[pos:html.find('</dd>', pos)]
		params[param_name] = param_explanation
	return params, pos


def get_returns(pos):
	end = html.find('</li>', pos)
	next_pos = html.find('<span class="returnLabel">', pos)
	if next_pos > end or next_pos == -1:
		return '', pos
	pos = html.find('<dd>', next_pos) + len('<dd>')
	returns = html[pos:html.find('</dd>', pos)]
	pos = html.find('</dd>', pos) + len('</dd>')
	return returns, pos


def comment_format(comment_str, hasTab=True):
	comment_strs = []
	comment_str = (tab if hasTab else '') + ' * ' + comment_str
	while len(comment_str) > 80 or comment_str[0:80].find('\n') is not -1:
		next_pos = comment_str[0:80].find('\n')
		if next_pos == -1:
			next_pos = comment_str[0:80].rfind(' ')
		comment_strs.append(comment_str[0:next_pos])
		comment_str = (tab if hasTab else '') + ' * ' + comment_str[next_pos + 1:].strip()
	comment_strs.append(comment_str)
	return comment_strs


def print_method(method, exp='', params=None, returns=''):
	url_file.write('\n\n')
	space = False
	if exp or params or returns:
		url_file.write(tab + '/**\n')

		if exp:
			exp_strs = comment_format(exp)
			for exp_str in exp_strs:
				url_file.write(exp_str + '\n')
			space = True

		if params:
			if space:
				space = False
				url_file.write(tab + ' *\n')
			for param_name, param in params.iteritems():
				param_strs = comment_format('@param ' + param_name + ' ' + param.strip())
				for param_str in param_strs:
					url_file.write(param_str + '\n')
			space = True

		if returns:
			if space:
				space = False
				url_file.write(tab + ' *\n')
			return_strs = comment_format('@return' + ' ' + returns.strip())
			for return_str in return_strs:
				url_file.write(return_str + '\n')

		url_file.write(tab + ' */\n')
	url_file.write(tab + method + ' {\n')
	url_file.write(tab + tab + '// TODO: implementation required\n')
	url_file.write(tab + '}\n')


def main():
	global url_file
	url_file = open(file_path, 'w')

	pos = html.find('<div class="block">') + len('<div class="block">')
	class_exp = process_raw(html[pos:html.find('</div>', pos)])
	url_file.write('\n/**\n')
	exp_strs = comment_format(class_exp, False)
	for exp_str in exp_strs:
		url_file.write(exp_str + '\n')
	url_file.write(' */\n')
	url_file.write('public class ' + class_name + ' {\n')

	pos = html.find(' Detail</h3>')
	while pos != -1:
		detail_type = html[html.rfind('<h3>', 0, pos) + 4:pos]

		if detail_type == 'Field':
			next_pos = html.find(' Detail</h3>', pos + 1)
			url_file.write('\n')
			while True:
				field, new_pos = get_method(pos)
				if not field or new_pos >= next_pos:
					break
				pos = new_pos
				exp, pos = get_exp(pos)
				url_file.write('\n')
				if exp:
					url_file.write(tab + '/**\n')
					exp_strs = comment_format(exp)
					for exp_str in exp_strs:
						url_file.write(exp_str + '\n')
					url_file.write(tab + ' */\n')
				url_file.write(tab + field)
				if field[len(field) - 1] != ';':
					url_file.write(';')
				url_file.write('\n')

		if detail_type == 'Constructor':
			method, pos = get_method(pos)
			exp, pos = get_exp(pos)
			params, pos = get_params(pos)
			print_method(method, exp, params)

		if detail_type == 'Method':
			while True:
				method, pos = get_method(pos)
				if not method:
					break
				exp, pos = get_exp(pos)
				params, pos = get_params(pos)
				returns, pos = get_returns(pos)
				print_method(method, exp, params, returns)

		if pos == -1:
			break

		pos = html.find(' Detail</h3>', pos + 1)

	url_file.write('}\n')
	url_file.close()


main()
