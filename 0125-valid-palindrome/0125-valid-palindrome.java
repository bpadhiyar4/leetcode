class Solution {
    public boolean isPalindrome(String s) {
        int len = s.length();
        int i = 0;
        int j = len - 1;

        while (i < j) {
            int iChar = s.charAt(i);
            int jChar = s.charAt(j);
            if (!Character.isLetterOrDigit(iChar)) {
                i++;
            } else if (!Character.isLetterOrDigit(jChar)) {
                j--;
            } else {
                if (Character.toLowerCase(iChar) != Character.toLowerCase(jChar)) {
                    return false;
                }
                
                i++;
                j--;
            }
        }

        return true;
    }
}