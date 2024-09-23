class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int len = s.length();
        int left = 0;
        int maxLen = 0;

        for (int right = 0; right < len; right++) {
            char ch = s.charAt(right);
            if (!map.containsKey(ch) || map.get(ch) < left) {
                map.put(ch, right);
                maxLen = Math.max(maxLen, right - left + 1);
            } else {
                left = map.get(ch) + 1;
                map.put(ch, right);
            }
        }

        return maxLen;
    }
}