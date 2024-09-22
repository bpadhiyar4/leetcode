class Solution {
    public boolean isIsomorphic(String s, String t) {
        int sLen = s.length();

        Map<Character, Character> map = new HashMap<>();
        int[] mapS = new int[256];
        int[] mapT = new int[256];
        for(int i=0; i < sLen; i++) {
            char tCh = t.charAt(i);
            char sCh = s.charAt(i);
            
            if ((mapS[sCh] != 0 && mapS[sCh] != tCh) || 
                (mapT[tCh] != 0 && mapT[tCh] != sCh)) {
                return false;
            }

            mapS[sCh] = tCh;
            mapT[tCh] = sCh;
        }

        return true;
    }
}