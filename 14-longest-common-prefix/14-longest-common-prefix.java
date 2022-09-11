class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        String prefix = "";
        
        int index = 0;
        boolean flag = true;
        while(flag) {
            if(strs[0].length() <= index) {
                return prefix;
            }
            
            char ch = strs[0].charAt(index);
            
            for(String s: strs) {
                if(s.length() <= index || s.charAt(index) != ch) {
                    return prefix;
                }
            }
            
            prefix += ch;
            index++;
        }
        
        return prefix;
    }
}