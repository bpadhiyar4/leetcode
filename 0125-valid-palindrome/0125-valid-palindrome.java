class Solution {
    public boolean isPalindrome(String s) {
        int len = s.length();
        int i = 0;
        int j = len - 1;
        s = s.toLowerCase();

        while (i < j) {
            int iChar = (int) s.charAt(i);
            int jChar = (int) s.charAt(j);
            if (!Character.isLetterOrDigit(iChar)) {
                i++;
            } else if (!Character.isLetterOrDigit(jChar)) {
                j--;
            } else {
                if (iChar != jChar) {
                    return false;
                }
                
                i++;
                j--;
            }
        }

        return true;
    }
}