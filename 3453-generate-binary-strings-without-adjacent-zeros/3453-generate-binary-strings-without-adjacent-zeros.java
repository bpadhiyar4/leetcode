class Solution {

    public List<String> validStrings(int n) {
        List<String> result = new ArrayList<>();
        backtrack(result, new StringBuilder(), n, 0);
        return result;
    }

    private void backtrack(List<String> result, StringBuilder sb, int n, int index) {
        if (n == index) {
            result.add(sb.toString());
            return;
        }

        sb.append('0');
        if (isValid(sb)) {
            backtrack(result, sb, n, index+1);
        }

        sb.deleteCharAt(sb.length()-1);

        sb.append('1');
        if (isValid(sb)) {
            backtrack(result, sb, n, index+1);
        }

        sb.deleteCharAt(sb.length()-1);
    }

    private boolean isValid(StringBuilder sb) {
        int len = sb.length();

        if (len >=2 && sb.charAt(len - 1) == '0' && sb.charAt(len - 2) == '0') {
            return false;
        }

        return true;
    }
}