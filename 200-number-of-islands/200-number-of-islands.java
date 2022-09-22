class Solution {
    public int numIslands(char[][] grid) {
        int ans =0;
        
        for(int row=0;row<grid.length;row++) {
            for(int col=0; col < grid[0].length;col++) {
                if(grid[row][col] == '1') {
                    ans++;
                    travel(grid, row, col);
                }
            }
        }
        
        return ans;
    }
    
    public void travel(char[][] grid, int row, int col) {
        if(row < 0 || row >= grid.length || col < 0 || col >= grid[0].length || grid[row][col] == '0') {
            return;
        }
        
        grid[row][col] = '0';
        
        travel(grid, row+1, col);
        travel(grid, row-1, col);
        travel(grid, row, col+1);
        travel(grid, row, col-1);
    }
}