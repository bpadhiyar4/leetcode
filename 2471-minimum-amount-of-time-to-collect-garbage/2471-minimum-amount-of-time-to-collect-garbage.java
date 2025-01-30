class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        int totalG = 0, lastG = 0;
        int totalP = 0, lastP = 0;
        int totalM = 0, lastM = 0;

        int totalGarbage = garbage.length;
        for (int i=0; i < totalGarbage; i++) {
            String singleGarbage = garbage[i];
            for (char s: singleGarbage.toCharArray()) {
                if (s == 'M') {
                    totalM++;
                    lastM = i;
                } else if (s == 'P') {
                    totalP++;
                    lastP = i;
                } else if (s == 'G') {
                    totalG++;
                    lastG = i;
                }
            }
        }

        int ans = 0;
        ans = totalM + findTravelUnit(travel, lastM - 1);
        ans += totalP + findTravelUnit(travel, lastP - 1);
        ans += totalG + findTravelUnit(travel, lastG - 1);
        return ans;
    }


    int findTravelUnit(int[] travel, int endIndex) {
        int unit = 0;
        for (int i=0; i<=endIndex;i++) {
            unit += travel[i];
        }

        return unit;
    }
}