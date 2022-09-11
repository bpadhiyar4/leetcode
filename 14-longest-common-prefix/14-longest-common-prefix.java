class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        if(strs.length == 1) {
            return strs[0];
        }
        
        String prefix = "";
        
        int index = 0;
        // char ch = strs[0].charAt(0);
        boolean flag = true;
        while(flag) {
            char ch;
            if(strs[0].length() > index) {
                ch = strs[0].charAt(index);
            } else {
                return prefix;
            }
            
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