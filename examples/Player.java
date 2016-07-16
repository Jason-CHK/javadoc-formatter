
/**
 * Represents a player in the Spy Game.
 */
public class Player {


    /**
     * @param name - Player's name
     */
    public Player(java.lang.String name, int budget, int spycams, GraphNode startnode) {
        // TODO: implementation required
    }


    /**
     * @return name of player
     */
    public java.lang.String getName() {
        // TODO: implementation required
    }


    /**
     * @return remaining budget
     */
    public int getBudget() {
        // TODO: implementation required
    }


    /**
     */
    public void decreaseBudget(int dec) {
        // TODO: implementation required
    }


    /**
     * If there are no remaining spy cams to drop, display "Not enough spycams"
     * and return false. Otherwise: If there is not a spy cam at the player's
     * current location: drop a spy cam (here) D decrement the remaining spy
     * cam count if there was not already a spycam
     *
     * @return true if a spycam is dropped
     */
    public boolean dropSpycam() {
        // TODO: implementation required
    }


    /**
     * Check the node to see if there is a spy cam. If there is a spy cam at
     * that node, remove the spy cam from that node. Also, remove the spy cam
     * name from the Player's list of spy cam names. Otherwise, return false.
     *
     * @param node - The node the player asked to remove a spy cam from.
     *
     * @return true if a spycam is retrieved
     */
    public boolean pickupSpycam(GraphNode node) {
        // TODO: implementation required
    }


    /**
     * @return number of spycams remaining
     */
    public int getSpycams() {
        // TODO: implementation required
    }


    /**
     * @param name - - Neighboring node to move to
     *
     * @return true if the player successfully moves to this node
     * if the cost is greater than 1, decrement budget by that amount
     */
    public boolean move(java.lang.String name) {
        // TODO: implementation required
    }


    /**
     * @return node label for the current location of the player
     */
    public java.lang.String getLocationName() {
        // TODO: implementation required
    }


    /**
     * Returns the node where the player is currently located.
     *
     * @return player's current node
     */
    public GraphNode getLocation() {
        // TODO: implementation required
    }


    /**
     * If pickupSpyCam is true, increment the number of spy cams remaining.
     *
     * @param pickupSpyCam - true if a spy cam was picked up. False means there
     * was no spy cam
     */
    public void getSpycamBack(boolean pickupSpyCam) {
        // TODO: implementation required
    }


    /**
     * Display the names of the locations where Spy Cams were dropped (and are
     * still there).
     */
    public void printSpyCamLocations() {
        // TODO: implementation required
    }
}