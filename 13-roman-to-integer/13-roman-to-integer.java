class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> roman = new HashMap<>();
        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);
        
        char[] ch = s.toCharArray();
        int i =0;
        int len = s.length();
        int number = 0;
        while(i < len) {
            if(i == len -1) {
                number += roman.get(ch[i]);
                break;
            }
            
            int n1 = roman.get(ch[i]);
            int n2 = roman.get(ch[i+1]);
            if(n1 < n2) {
                number += (n2 - n1);
                i += 2;
            } else {
                number += n1;
                i++;
            }
        }
        
        return number;
    }
}