class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        
        Map<Character, Integer> map = new HashMap<>();
        int len = s.length();
        for(int i=0, j=0; j<len;j++) {
            
            if(map.containsKey(s.charAt(j)))  {
                i = Math.max(map.get(s.charAt(j)), i);
            }
            
            maxLength = Math.max(maxLength, j-i+1);
            map.put(s.charAt(j), j+1);
        }
        
        return maxLength;
    }
}