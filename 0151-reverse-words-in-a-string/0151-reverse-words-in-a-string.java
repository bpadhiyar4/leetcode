class Solution {
    public String reverseWords(String s) {
        int len = s.length();
        int start;
        int end = len-1;
        StringBuilder ans = new StringBuilder();
        while (end >= 0) {
            while (end >=0 && s.charAt(end) == ' ') {
                end--;
            }

            // end pointer is > 0 it means that next word doesn't exist.
            if (end < 0) {
                return ans.toString();
            }

            // assign the start as end.
            start = end;
            while (start >= 0 && s.charAt(start) != ' ') {
                start--;
            }

            if (ans.isEmpty()) {
                ans.append(s.substring(start+1, end+1));
            } else {
                ans.append(" ").append(s.substring(start+1, end+1));
            }

            end = start;
        }

        return ans.toString();
    }
}