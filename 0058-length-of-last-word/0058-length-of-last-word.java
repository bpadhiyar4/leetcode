class Solution {
    public int lengthOfLastWord(String s) {
        int len = s.length();
        boolean start = false; 
        int wordLen = 0;
        for (int i = len - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                start = true;
                wordLen++;
            } else if (start && wordLen > 0) {
                break;
            }
        }

        return wordLen;
    }
}