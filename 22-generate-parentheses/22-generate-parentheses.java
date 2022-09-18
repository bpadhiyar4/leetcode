class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        solve(ans, n, "");
        return ans;
    }
    
    
    private void solve(List<String> ansList, int n, String ansString) {
        if(n*2 == ansString.length()) {
            if(isValid(ansString)) {
                ansList.add(ansString);
            }
            
            return;
        }
        
        solve(ansList, n, ansString + "(");
        solve(ansList, n, ansString + ")");
    }
    
    private boolean isValid(String str) {
        char[] arr = str.toCharArray();
        Stack<Character> stack = new Stack<>();
        for(char ch : arr) {
            if(ch == ')') {
                if(stack.isEmpty() || stack.pop() != '(') {
                    return false;
                }
            } else {
                stack.push(ch);
            }
        }
        
        return stack.isEmpty();
    }
}