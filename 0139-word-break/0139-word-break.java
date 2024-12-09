class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        int sLen = s.length();
        boolean[] dp = new boolean[sLen+1];
        Arrays.fill(dp, false);
        dp[sLen] = true;

        for (int i=sLen-1; i>=0; i--) {
            for (String word: wordDict) {
                if(i+word.length() <= sLen && s.substring(i, i+word.length()).equals(word)) {
                    dp[i] = dp[i+word.length()];
                }

                if(dp[i] == true) {
                    break;
                }
            }
        }

        return dp[0];
    }
}