class Solution {
    public String longestCommonPrefix(String[] strs) {
        int len = strs.length;
        StringBuilder value = new StringBuilder();
        int firstStringLen = strs[0].length();

        for (int i = 0; i < firstStringLen; i++) {
            char ch = strs[0].charAt(i);

            for (int j = 1; j < len; j++) {
                if (i >= strs[j].length() || ch != strs[j].charAt(i)) {
                    return value.toString();
                }
            }

            value.append(ch);
        }


        return value.toString();
    }
}