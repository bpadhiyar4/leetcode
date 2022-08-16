class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] charCount = new int[26];
        char[] charArr = magazine.toCharArray();
        
        for(char ch : charArr) {
            charCount[ch - 'a']++;
        }
        
        for(char ch : ransomNote.toCharArray()) {
            if(charCount[ch - 'a'] == 0) {
                return false;
            } else {
                charCount[ch - 'a']--;
            }
        }
        
        return true;
    }
}