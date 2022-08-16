class Solution {
    public boolean isAnagram(String s, String t) {
        
        if(s.length() != t.length()) {
            return false;
        }
        
        int[] charCount = new int[26];
        char[] charArr = s.toCharArray();
        
        for(char ch : charArr) {
            charCount[ch - 'a']++;
        }
        
        for(char ch : t.toCharArray()) {
            if(charCount[ch - 'a'] == 0) {
                return false;
            } else {
                charCount[ch - 'a']--;
            }
        }
        
        return true;
    }
}