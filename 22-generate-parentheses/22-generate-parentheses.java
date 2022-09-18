class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        solve(n-1, n, ans, "(");
        return ans;
    }
    
    private void solve(int open, int close, List<String> ansList, String ansString) {
        if(open == 0 && close == 0) {
            ansList.add(ansString);
            return;
        }
        
        if(open < 0 || close < 0 || open > close) {
            return;
        }
        
        solve(open -1, close, ansList, ansString + "(");
        solve(open, close - 1, ansList, ansString + ")");
    }
}