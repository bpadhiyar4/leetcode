class Solution {
    public int lengthOfLongestSubstring(String s) {
        int result = 0;
        int length = s.length();
        
        if(length <2) {
            return length;
        }
        for(int i = 0; i<length;i++) {
            Set<Character> set = new HashSet<>();
            for(int j = i;j<length;j++) {
                if(set.contains(s.charAt(j))) {
                    break;
                }
                
                set.add(s.charAt(j));
            }
            
            result = Math.max(result, set.size());
        }
        
        return result == 0 ? 1 : result;
    }
}