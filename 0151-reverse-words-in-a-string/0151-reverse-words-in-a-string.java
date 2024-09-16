class Solution {
    public String reverseWords(String s) {
        Stack<String> words = new Stack<>();
        StringBuilder word = new StringBuilder();
        int len = s.length();
        for (int i = 0; i < len; i++) {
            char ch = s.charAt(i);
            if (Character.isLetterOrDigit(s.charAt(i))) {
                word.append(ch);
            } else if (!word.isEmpty()) {
                words.push(word.toString());
                word = new StringBuilder();
            }
        }

        if (!word.isEmpty()) {
            words.push(word.toString());
            word = new StringBuilder();
        }

        StringBuilder ans = new StringBuilder();
        while(!words.isEmpty()) {
            ans.append(words.pop());
            if (!words.isEmpty()) {
                ans.append(" ");
            }
        }

        return ans.toString();
    }
}