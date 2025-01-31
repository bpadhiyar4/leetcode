class Solution {
    public int uniquePaths(int m, int n) {
        int[] row = new int[n];
        Arrays.fill(row, 1);

        for(int i=0; i<m-1; i++) {
            int[] newRow = new int[n];
            newRow[0] = 1;
            for (int j= 1; j<n;j++) {
                newRow[j] = newRow[j-1] + row[j];
            }

            row = newRow;
        }

        return row[n-1];
    }
}