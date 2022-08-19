class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('{', '}');
        map.put('[', ']');
        
        for(char ch : s.toCharArray()) {
            Character val = map.get(ch);
            if(val == null) {
                if(stack.isEmpty()) {
                    return false;
                }
                char last = map.get(stack.pop());
                if(last != ch) {
                    return false;
                }
            } else {
                stack.push(ch);
            }
        }
        
        return stack.isEmpty();
    }
}