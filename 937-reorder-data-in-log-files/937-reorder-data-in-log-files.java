class Solution {
    public String[] reorderLogFiles(String[] logs) {
        Arrays.sort(logs, (str1, str2) -> {
            
            if(Character.isAlphabetic(str1.charAt(str1.length() -1)) && Character.isAlphabetic(str2.charAt(str2.length() -1))) {
                int res = str1.substring(str1.indexOf(" "), str1.length()).compareTo(str2.substring(str2.indexOf(" "), str2.length()));
                
                return res == 0 ? str1.compareTo(str2) : res;
            } else if(Character.isDigit(str1.charAt(str1.length() -1)) && Character.isDigit(str2.charAt(str2.length() -1))) {
                return 0;
            } else {
                return Character.isAlphabetic(str1.charAt(str1.length() -1)) ? -1 : 1;
            }
        });
        return logs;
    }
}