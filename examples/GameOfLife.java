
/**
 * Sets all the cells in the world to not alive (false).
 */
public class GameOfLife {


    public GameOfLife() {
        // TODO: implementation required
    }


    /**
     * Program execution starts here.
     *
     * @param args - UNUSED
     */
    public static void main(java.lang.String[] args) {
        // TODO: implementation required
    }


    /**
     * Create a new world
     *
     * @param numRows - The number of rows to be in the created world
     *
     * @return A double dimension array of boolean that is numRows by 
     * numColumns in size and initialized to all false values.
     */
    public static boolean[][] createNewWorld(int numRows, int numColumns) {
        // TODO: implementation required
    }


    /**
     * Sets all the cells in the world to not alive (false).
     *
     * @param world - the world to clear all cells
     */
    public static void clearWorld(boolean[][] world) {
        // TODO: implementation required
    }


    /**
     * Initializes the world to the Glider pattern.
     * ..........
     * .@........
     * ..@@......
     * .@@.......
     * ..........
     * ..........
     * ..........
     * ..........
     * ..........
     * ..........
     *
     * @param world - the existing double dimension array that will be 
     * reinitialized to the Glider pattern.
     */
    public static void initializeGlider(boolean[][] world) {
        // TODO: implementation required
    }


    /**
     * Initializes the world to the Beacon pattern.
     * ..........
     * .@@.......
     * .@........
     * ....@.....
     * ...@@.....
     * ..........
     * ..........
     * ..........
     * ..........
     * ..........
     *
     * @param world - the existing double dimension array that will be 
     * reinitialized to the Beacon pattern.
     */
    public static void initializeBeacon(boolean[][] world) {
        // TODO: implementation required
    }


    /**
     * Initializes the world to the Boat pattern.
     * ..........
     * .@@.......
     * .@.@......
     * ..@.......
     * ..........
     * ..........
     * ..........
     * ..........
     * ..........
     * ..........
     *
     * @param world - the existing double dimension array that will be 
     * reinitialized to the Boat pattern.
     */
    public static void initializeBoat(boolean[][] world) {
        // TODO: implementation required
    }


    /**
     * Initializes the world to the R-pentomino pattern.
     * ..........
     * ..@@......
     * .@@.......
     * ..@.......
     * ..........
     * ..........
     * ..........
     * ..........
     * ..........
     * ..........
     *
     * @param world - the existing double dimension array that will be 
     * reinitialized to the R-pentomino pattern.
     */
    public static void initializeRpentomino(boolean[][] world) {
        // TODO: implementation required
    }


    /**
     * Initialize the GameOfLife world with a random selection of cells alive.
     *
     * @param world - the existing double dimension array that will be 
     * reinitialized to a Random pattern.
     */
    public static void initializeRandomWorld(boolean[][] world) {
        // TODO: implementation required
    }


    /**
     * Whether a cell is living in the next generation of the game.
     * The rules of the game are as follows:
     * 1) Any live cell with fewer than two live neighbors dies, as if caused
     * by under-population.
     * 2) Any live cell with two or three live neighbors lives on to the next 
     * generation.
     * 3) Any live cell with more than three live neighbors dies, as if by 
     * overcrowding.
     * 4) Any dead cell with exactly three live neighbors becomes a live cell, 
     * as if by reproduction.
     *
     * @param numLivingNeighbors - The number of neighbors that are currently
     * living.
     *
     * @return True if this cell is living in the next generation.
     */
    public static boolean isCellLivingInNextGeneration(int numLivingNeighbors, boolean cellCurrentlyLiving) {
        // TODO: implementation required
    }


    /**
     * Whether a specific neighbor is alive.
     * Check whether the specific cell is alive or dead.
     * Note that cellRow and cellColumn may not be valid. If the cellRow is 
     * less than 0 or greater than the number of rows -1 
     * then the cell is outside the world. If the cellColumn is less than 0 
     * or is greater than the number of columns -1 then 
     * the cell is outside the world. Return false for any cell outside the 
     * world.
     *
     * @param world - The current world.
     *
     * @return Whether the cell is alive.
     */
    public static boolean isNeighborAlive(boolean[][] world, int neighborCellRow, int neighborCellColumn) {
        // TODO: implementation required
    }


    /**
     * Counts the number of neighbors that are currently living around the 
     * specified cell.
     * A cell has eight neighbors. The neighbors are the cells that are 
     * horizontally, vertically and diagonally adjacent.
     * Note that if a specific cell is on the edge of the world then it may not
     * have neighboring cells.  For example: for the 0'th row (top row) of the 
     * world there are not any rows above it.
     * Assume all those cells are dead (have false values).
     *
     * @param world - The current world.
     *
     * @return The number of neighbor cells that are currently living.
     */
    public static int numNeighborsAlive(boolean[][] world, int cellRow, int cellColumn) {
        // TODO: implementation required
    }


    /**
     * Creates the next generation of the world.
     *
     * @param currentWorld - The world currently shown.
     */
    public static void nextGeneration(boolean[][] currentWorld, boolean[][] newWorld) {
        // TODO: implementation required
    }


    /**
     * Prints out the world showing each cell as alive or dead.
     * Loops through every cell of the world. If a cell is alive, print out
     * the Config.ALIVE character, otherwise the Config.DEAD character. 
     * Tracks how many cells are alive and prints out the number of cells alive
     * or that no cells are alive.
     *
     * @param patternName - The name of the pattern chosen by the user.
     */
    public static void printWorld(java.lang.String patternName, boolean[][] world, int generationNum) {
        // TODO: implementation required
    }
}
