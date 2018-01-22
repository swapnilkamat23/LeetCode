/**
 * Author: Swapnil Kamat
 */
public class NumberOfIslands {
	/**
	 * Traverse the grid to count number of islands.
	 * @param grid
	 * @return
	 */
	public static int numIslands(char[][] grid) {
        int islandCount = 0;
        for(int row = 0; row < grid.length; row++){
            for(int column = 0; column < grid[row].length; column++){
                if(grid[row][column]=='1'){
                    if(isIsland(grid, row, column)){
                        islandCount++;
                    }
                }
            }
        }
        return islandCount;
    }
    
	/**
	 * Explore the island using DFS by converting connected 1s to 0s.
	 * @param grid
	 * @param row
	 * @param column
	 * @return
	 */
    public static boolean isIsland(char[][] grid, int row, int column){
    	// check for outOfBounds
        if(row<0 || column<0 || row>=grid.length || column>=grid[row].length){
            return false;
        }
        // DFS if the current element is a land ('1')
        if(grid[row][column]=='1'){
        	// replace '1' with '0' to mark it as visited
            grid[row][column]='0';
            // recursive calls
            isIsland(grid, row-1, column);
            isIsland(grid, row+1, column);
            isIsland(grid, row, column-1);
            isIsland(grid, row, column+1);
        }
        return true;
    }
    
    /**
     * Main method
     * @param args
     */
    public static void main(String args[]){
    	char[][] grid = new char[][]{{'1','1','0','0','0'},{'1','1','0','0','0'},{'0','0','1','0','0'},{'0','0','0','1','1'}};
    	System.out.println("Number of islands = "+numIslands(grid));
    }
}
