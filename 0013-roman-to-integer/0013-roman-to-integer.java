class Solution {
    public int romanToInt(String s) {
        
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int value = 0;
        int len = s.length();

        for (int i = 0; i < len; i++) {
            if (i < len - 1 && romanMap.get(s.charAt(i)) < romanMap.get(s.charAt(i+1))) {
                value -= romanMap.get(s.charAt(i));
            } else {
                value += romanMap.get(s.charAt(i));
            }
        }

        return value;
    }
}