class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int text1Len = text1.length();
        int text2Len = text2.length();

        int[][] dp = new int[text1Len+1][text2Len+1];

        for (int i=text1Len-1; i>=0; i--) {
            for(int j=text2Len-1; j>=0; j--) {
                if (text1.charAt(i) == text2.charAt(j)) {
                    dp[i][j] = 1 + dp[i+1][j+1];
                } else {
                    dp[i][j] = Math.max(dp[i+1][j], dp[i][j+1]);
                }
            }
        }

        return dp[0][0];
    }
}