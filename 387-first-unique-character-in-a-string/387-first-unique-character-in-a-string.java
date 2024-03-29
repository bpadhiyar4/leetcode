class Solution {
    public int firstUniqChar(String s) {
        int ans = Integer.MAX_VALUE;
        
        for(char i='a'; i<='z'; i++) {
            int index = s.indexOf(i);
            if(s.indexOf(i) != -1 && index == s.lastIndexOf(i)) {
                ans = Math.min(ans, index);
            }
        }
        
        return ans == Integer.MAX_VALUE ? -1 : ans;
        
    }
}