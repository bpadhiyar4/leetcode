class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int ransomLen = ransomNote.length();
        int magLen = magazine.length();
        int start = 97;
        if (magLen < ransomLen) {
            return false;
        }

        int[] magArr = new int[26];

        for (int i = 0; i < magLen; i++) {
            int ch = magazine.charAt(i) - 97;
            magArr[ch] += 1;
        }

        for (int i = 0; i < ransomLen; i++) {
            int ch = ransomNote.charAt(i) - 97;
            int count = magArr[ch];
            if (count == 0) {
                return false;
            }

            magArr[ch] -= 1;
        }

        return true;
    }
}