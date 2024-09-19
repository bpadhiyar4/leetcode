class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int ransomLen = ransomNote.length();
        int magLen = magazine.length();

        if (magLen < ransomLen) {
            return false;
        }

        Map<Character, Integer> ransomMap = new HashMap();
        Map<Character, Integer> magMap = new HashMap();

        for (int i = 0; i < ransomLen; i++) {
            char currChar = ransomNote.charAt(i);
            ransomMap.put(currChar, ransomMap.getOrDefault(currChar, 0) + 1);
        }

        for (int i = 0; i < magLen; i++) {
            char currChar = magazine.charAt(i);
            magMap.put(currChar, magMap.getOrDefault(currChar, 0) + 1);
        }

        for (Map.Entry<Character, Integer> ran : ransomMap.entrySet()) {
            int count = magMap.getOrDefault(ran.getKey(), 0);
            if (count < ran.getValue()) {
                return false;
            }
        }

        return true;
    }
}