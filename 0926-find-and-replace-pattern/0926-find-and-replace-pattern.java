class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> ans = new ArrayList<>();

        for (String word: words) {
            int len = word.length();
            boolean match = true;
            for (int i=0; i<len; i++) {
                if (word.indexOf(word.charAt(i)) != pattern.indexOf(pattern.charAt(i))) {
                    match = false;
                    break;
                }
            }

            if (match) {
                ans.add(word);
            }
        }

        return ans;
    }
}