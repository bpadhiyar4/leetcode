class Solution {
    public int maxProduct(int[] nums) {
        int res = Arrays.stream(nums).max().getAsInt();
        int curMax = 1;
        int curMin = 1;

        for (int n:nums) {
            int temp = curMax * n;
            curMax = Math.max(temp, Math.max(curMin * n, n));
            curMin = Math.min(temp, Math.min(curMin * n, n));
            res = Math.max(res, curMax);
        }

        return res;
    }
}