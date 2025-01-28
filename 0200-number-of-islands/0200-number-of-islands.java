class Solution {
    public int numIslands(char[][] grid) {
        int ans = 0;
        int row = grid.length;
        int col = grid[0].length;

        for (int i=0; i<row; i++) {
            for(int j=0; j<col; j++) {
                if (grid[i][j] == '1') {
                    ans++;
                    travel(grid, i, j);
                }
            }
        }

        return ans;
    }

    void travel(char[][] grid, int row, int col) {
        if (row < 0 || col < 0 || row >= grid.length || col >= grid[0].length || grid[row][col] == '0') {
            return;
        }

        grid[row][col] = '0';
        travel(grid, row + 1, col);
        travel(grid, row - 1, col);
        travel(grid, row, col + 1);
        travel(grid, row, col - 1);
    }
}