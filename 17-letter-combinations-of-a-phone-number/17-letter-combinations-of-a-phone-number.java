class Solution {
    
        char[][] pad = new char[][]{
            {},{},
            {'a', 'b', 'c'},
            {'d', 'e', 'f'},
            {'g', 'h', 'i'},
            {'j', 'k', 'l'},
            {'m', 'n', 'o'},
            {'p', 'q', 'r', 's'},
            {'t', 'u', 'v'},
            {'w', 'x', 'y', 'z'}
        };
        
    public List<String> letterCombinations(String digits) {
        
        if(digits.length() == 0) {
            return Collections.emptyList();
        }
        
        List<String> ansList = new ArrayList<>();
        solve(digits, "", ansList, 0);
        return ansList;
    }
    
    private void solve(String digits, String ansString, List<String> ansList, int index) {
        int digitLen = digits.length();
        if(index >= digitLen) {
            ansList.add(ansString);
            return;
        }
        
        int curInt = Character.getNumericValue(digits.charAt(index));
        int numPadLen = pad[curInt].length;
            
        for(int j = 0; j< numPadLen; j++) {
            solve(digits, ansString + pad[curInt][j], ansList, index+1);
        }
    }
}