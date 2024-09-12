class Solution {
    public int hIndex(int[] citations) {
        int n = citations.length;
        int[] bucket = new int[n+1];

        for(int citation : citations) {
            if (citation >= n) {
                bucket[n]++;
            } else {
                bucket[citation]++;
            }
        }

        int sum = 0;

        for (int hIndex = n; hIndex>= 0; hIndex--) {
            sum += bucket[hIndex];
            if (sum >= hIndex) {
                return hIndex;
            }
        }

        return 0;
    }
}