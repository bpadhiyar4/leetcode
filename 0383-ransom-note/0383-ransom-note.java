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
            int ch = magazine.charAt(i) - 'a';
            magArr[ch]++;
        }

        for (int i = 0; i < ransomLen; i++) {
            int ch = ransomNote.charAt(i) - 'a';
            int count = magArr[ch];
            if (count == 0) {
                return false;
            }

            magArr[ch]--;
        }

        return true;
    }
}