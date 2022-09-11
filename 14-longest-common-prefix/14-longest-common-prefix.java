class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        
        String first = strs[0];
        String last = strs[strs.length -1];
        int index = 0;
        int len = first.length();
        for(; index < len; index++) {
            if(first.charAt(index) != last.charAt(index)) {
                break;
            }
        }
        
        return first.substring(0, index);
    }
}