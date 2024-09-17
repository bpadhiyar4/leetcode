class Solution {
    public boolean isSubsequence(String s, String t) {
        int sLen = s.length();
        int tLen = t.length();

        int sIndex = 0;
        int tIndex = 0;

        while (sIndex < sLen && tIndex < tLen) {
            if (s.charAt(sIndex) == t.charAt(tIndex)) {
                tIndex++;
                sIndex++;
            } else {
                tIndex++;
            }
        }

        return sIndex == sLen;
    }
}