class Solution {
    public int climbStairs(int n) {
        if (n == 1) {
            return 1;
        }
        int[] cache = new int[n];
        cache[n-1] = 1;
        cache[n-2] = 1;
        for(int i=n-3; i>=0; i--) {
            cache[i] = cache[i+1] + cache[i+2];
        }

        return cache[0] + cache[1];
    }
}