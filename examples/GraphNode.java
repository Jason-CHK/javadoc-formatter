
/**
 * Represents a valid location in the game graph.
 */
public class GraphNode {


    public static final int NOT_NEIGHBOR;


    /**
     * Represents a valid location in the game graph. There can be a player, a
     * spycam, or a spy at any graph node.
     *
     * @param name - The label that uniquely identifies this graph node.
     */
    public GraphNode(java.lang.String name) {
        // TODO: implementation required
    }


    /**
     * @return name of node
     */
    public java.lang.String getNodeName() {
        // TODO: implementation required
    }


    /**
     * @return a list of neighbors
     */
    public java.util.List<Neighbor> getNeighbors() {
        // TODO: implementation required
    }


    /**
     * Returns true if this node name is a neighbor of current node. Can tell
     * this by the cost. If the cost to a potential neighbor is same as the
     * GraphNode.NOT_NEIGHBOR constant, then the node is not a direct (one
     * move) neighbor.
     *
     * @param neighborName - to look for
     *
     * @return true if the node is an adjacent neighbor.
     */
    public boolean isNeighbor(java.lang.String neighborName) {
        // TODO: implementation required
    }


    /**
     * Maintains sorted order of neighbors by neighbor name.
     *
     * @param neighbor - An adjacent node (a neighbor)
     */
    public void addNeighbor(GraphNode neighbor, int cost) {
        // TODO: implementation required
    }


    /**
     * Returns and iterator that can be used to find neighbors of this
     * GraphNode.
     *
     * @return An iterator of String node labels
     */
    public java.util.Iterator<java.lang.String> getNeighborNames() {
        // TODO: implementation required
    }


    /**
     * @return true if the GraphNode has a spycam
     */
    public boolean getSpycam() {
        // TODO: implementation required
    }


    /**
     * @param cam - indicates whether the node now has a spycam
     */
    public void setSpycam(boolean cam) {
        // TODO: implementation required
    }


    /**
     * @param neighborName - name of potential neighbor
     *
     * @return cost to neighborName
     */
    public int getCostTo(java.lang.String neighborName) throws NotNeighborException {
        // TODO: implementation required
    }


    /**
     * @param name - name of potential neighbor
     *
     * @return the GraphNode associated with name that is a neighbor of the
     * current node
     */
    public GraphNode getNeighbor(java.lang.String name) throws NotNeighborException {
        // TODO: implementation required
    }


    /**
     * Print a list of neighbors and the cost of the edge to them
     */
    public void displayCostToEachNeighbor() {
        // TODO: implementation required
    }


    /**
     * Return the results of comparing this node's name to the other node's
     * name. Allows collections of nodes to be sorted using the built-in sort
     * methods.
     *
     * @param otherNode - Another node to compare names with this node.
     *
     * @return the result of compareTo on the node names only.
     */
    public int compareTo(GraphNode otherNode) {
        // TODO: implementation required
    }


    /**
     * @return name of node
     */
    public java.lang.String toString() {
        // TODO: implementation required
    }


    /**
     * Display's the node name followed by a list of neighbors to this node.
     * Example: a's neighbors are: z m f p
     */
    public void printNeighborNames() {
        // TODO: implementation required
    }
}