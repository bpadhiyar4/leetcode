class Solution {
    public int countSubstrings(String s) {
        int len = s.length();
        int total = 0;
        for (int i=0;i<len;i++) {
            int l = i;
            int r = i;

            while (l >=0 && r < len && s.charAt(l) == s.charAt(r)) {
                total++;
                l--;
                r++;
            }

            l = i;
            r = i+1;
            while (l >=0 && r < len && s.charAt(l) == s.charAt(r)) {
                total++;
                l--;
                r++;
            }
        }

        return total;
    }
}