class Solution {
    public String longestPalindrome(String s) {
        int len = s.length();
        String ans = "";
        for(int i=0;i <= len-1;i++) {
            for(int j = len -1; j>=i; j--) {
                if(s.charAt(i) == s.charAt(j) && isPalindrome(s, i, j)) {
                    String temp = s.substring(i, j+1);
                    ans = ans.length() > temp.length() ? ans : temp;
                    break;
                }
            }
        }
        
        return ans;
    }
    
    private boolean isPalindrome(String s, int m, int n) {
        while(m <= n) {
            if(s.charAt(m) != s.charAt(n)) {
                return false;
            }
            
            m++;
            n--;
        }
        
        return true;
    }
}