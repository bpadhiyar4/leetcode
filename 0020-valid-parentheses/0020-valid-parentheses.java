class Solution {
    public boolean isValid(String s) {
        Stack<Character> paraStack = new Stack<>();
        int len = s.length();

        if (len % 2 != 0) {
            return false;
        }

        Map<Character, Character> map = new HashMap<>();
        map.put('[', ']');
        map.put('{', '}');
        map.put('(', ')');
        
        for (int i=0; i < len; i++) {
            Character currCh = s.charAt(i);
            if (map.containsKey(currCh)) {
                paraStack.push(currCh);
            } else if (paraStack.size() == 0 || map.get(paraStack.pop()) != currCh) {
                return false;
            }
        }

        return paraStack.size() == 0 ? true : false;
    }
}