class Solution {
    public boolean isValid(String s) {
        Stack<Character> paraStack = new Stack<>();
        int len = s.length();

        if (len % 2 != 0) {
            return false;
        }

        for (int i=0; i < len; i++) {
            Character currCh = s.charAt(i);
            if (currCh == '{' || currCh == '(' || currCh == '[') {
                paraStack.push(currCh);
                continue;
            } else if (paraStack.size() == 0) {
                return false;
            }

            Character popChar = paraStack.pop();
            if ((currCh == '}' && popChar != '{') || 
                (currCh == ')' && popChar != '(') || 
                (currCh == ']' && popChar != '[')
                ) {
                    return false;
                }
        }

        return paraStack.size() == 0 ? true : false;
    }
}