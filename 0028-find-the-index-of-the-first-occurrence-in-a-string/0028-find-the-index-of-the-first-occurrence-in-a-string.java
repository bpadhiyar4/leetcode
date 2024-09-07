class Solution {
    public int strStr(String haystack, String needle) {
        int haystackLen = haystack.length();
        int needleLen = needle.length();

        for(int i = 0; i <= haystackLen - needleLen; i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                for(int j = 0, k = i; k < haystackLen && j < needleLen; j++, k++) {
                    if(haystack.charAt(k) != needle.charAt(j)) {
                        break;
                    }

                    if (j == needleLen - 1) {
                        return i;
                    }
                }
            }


        }

        return -1;
    }
}