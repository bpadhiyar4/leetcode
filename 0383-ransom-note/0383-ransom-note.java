class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int ransomLen = ransomNote.length();
        int magLen = magazine.length();
        int start = 97;
        if (magLen < ransomLen) {
            return false;
        }

        int[] magArr = new int[26];

        for (char c: magazine.toCharArray()) {
            magArr[c - 'a']++;
        } 

        for (char c: ransomNote.toCharArray()) {
            if (magArr[c - 'a'] == 0) {
                return false;
            }

            magArr[c - 'a']--;
        }

        return true;
    }
}