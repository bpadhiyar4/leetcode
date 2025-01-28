class Solution {
    public int numIslands(char[][] grid) {
        int ans = 0;
        int rowLen = grid.length;
        int colLen = grid[0].length;

        for (int i=0; i<rowLen; i++) {
            for(int j=0; j<colLen; j++) {
                if (grid[i][j] == '1') {
                    ans++;
                    travel(grid, i, j, rowLen, colLen);
                }
            }
        }

        return ans;
    }

    void travel(char[][] grid, int row, int col, int rowLen, int colLen) {
        grid[row][col] = '0';

        if (row > 0 && grid[row-1][col] == '1') {
            travel(grid, row-1, col, rowLen, colLen);
        }

        if (row + 1 < rowLen && grid[row+1][col] == '1') {
            travel(grid, row+1, col, rowLen, colLen);
        }

        if (col > 0 && grid[row][col-1] == '1') {
            travel(grid, row, col-1, rowLen, colLen);
        }

        if (col + 1 < colLen && grid[row][col+1] == '1') {
            travel(grid, row, col+1, rowLen, colLen);
        }

        // travel(grid, row + 1, col);
        // travel(grid, row - 1, col);
        // travel(grid, row, col + 1);
        // travel(grid, row, col - 1);
    }
}