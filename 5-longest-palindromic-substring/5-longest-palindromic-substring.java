class Solution {
    
    public String longestPalindrome(String s) {
        int length = s.length();
        int[][] dp = new int[length][length];
        String ans = "";
        int maxLength = 0;
        for (int diff = 0; diff < length; diff++) {
            for (int i = 0, j = i + diff; j < length; i++, j++) {
                if (i == j) {
                    dp[i][j] = 1;
                } else if (diff == 1 && s.charAt(i) == s.charAt(j)) {
                    dp[i][j] = 2;
                } else if (s.charAt(i) == s.charAt(j) && dp[i + 1][j - 1] != 0) {
                    dp[i][j] = 2 + dp[i + 1][j - 1];
                }

                if (dp[i][j] != 0 && j - i + 1 > maxLength) {
                    maxLength = j - i + 1;
                    ans = s.substring(i, i+maxLength);
                }
            }
        }

        return ans;
    }
    
}