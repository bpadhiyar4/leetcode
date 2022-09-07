class Solution {
    
    int resultStart;
    int resultLength;
    
    public String longestPalindrome(String s) {
        int len = s.length();
        for(int start =0; start<len;start++) {
            expandRange(s, start, start);
            expandRange(s, start, start+1);
        }
        
        
        return s.substring(resultStart, resultStart+resultLength);
    }
    
    private void expandRange(String s, int begin, int end) {
        int len = s.length();
        while(begin >=0 && end <len && s.charAt(begin) == s.charAt(end)) {
            begin--;
            end++;
        }
        
        if(resultLength < end - begin - 1) {
            resultStart = begin+1;
            resultLength = end - begin - 1;
        }
    }
    
}