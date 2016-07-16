
/**
 * Used by GraphNode class to keep a list of 'this' node's neighbors and the
 * cost to reach each of those neighbors. Stores the neignbor node and the cost
 * to travel from this node to this neighbor node. Instances of this class are
 * created to establish an edge (path) from 'this' GraphNode to the specified
 * neighbor node.
 */
public class Neighbor {


    /**
     * A neighbor is added to an existing GraphNode by creating an instance of
     * Neighbor that stores the neighbor and the cost to reach that neighbor.
     *
     * @param cost - The cost to reach this neighbor.
     */
    public Neighbor(int cost, GraphNode neighbor) {
        // TODO: implementation required
    }


    /**
     * Returns the cost of travelling this edge to get to the Neighbor at the
     * other end of this edge.
     *
     * @return the cost of the edge to get to this neighbor
     */
    public int getCost() {
        // TODO: implementation required
    }


    /**
     * Returns the Neighbor (node) that is at the other end of "this" node's
     * edge.
     *
     * @return the neighbor node itself.
     */
    public GraphNode getNeighborNode() {
        // TODO: implementation required
    }


    /**
     * Compares the node names of this node and the otherNode. Returns the
     * results of comparing this node's name to the otherNode's name. Allows
     * Lists of Neighbors to be sorted using built-in sort methods.
     *
     * @param otherNode - neighbor to be compared
     *
     * @return compareTo the node names of two neighbors
     */
    public int compareTo(Neighbor otherNode) {
        // TODO: implementation required
    }


    /**
     * Returns a String representation of this Neighbor. The String that is
     * returned shows an arrow (with the cost in the middle) and then the
     * Neighbor node's name. Example:  --1--> b  indicates a cost of 1 to get
     * to node b
     *
     * @return a String with the cost and destination node:
     */
    public java.lang.String toString() {
        // TODO: implementation required
    }
}