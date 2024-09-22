class Solution {
    public boolean isIsomorphic(String s, String t) {
        int sLen = s.length();

        Map<Character, Character> map = new HashMap<>();
        for(int i=0; i < sLen; i++) {
            Character tCh = t.charAt(i);
            Character sCh = s.charAt(i);
            Character mapped = map.get(sCh);
            if (mapped == null) {
                if (map.containsValue(tCh)) {
                    return false;
                }

                map.put(sCh, tCh);
            } else if (mapped != tCh) {
                return false;
            }
        }

        return true;
    }
}