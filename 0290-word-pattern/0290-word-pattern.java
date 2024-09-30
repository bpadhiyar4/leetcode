class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] stringArr = s.split("\\s+");
        Map<Character, String> map = new HashMap<>();
        int patternLen = pattern.length();
        
        if (stringArr.length != patternLen) {
            return false;
        }

        for (int i=0; i < patternLen; i++) {
            char patternCh = pattern.charAt(i);
            if (map.containsKey(patternCh)) {
                if (!map.get(patternCh).equals(stringArr[i])) {
                    return false;
                }
            } else if (map.containsValue(stringArr[i])) {
                return false;
            } else {
                map.put(patternCh, stringArr[i]);
            }
        }

        return true;
    }
}