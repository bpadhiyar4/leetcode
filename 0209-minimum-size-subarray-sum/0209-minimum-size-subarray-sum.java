class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int len = nums.length;
        int minWindow = Integer.MAX_VALUE;
        int windowStart = 0;
        int sum = 0;
        
        for (int windowEnd = 0; windowEnd < len; windowEnd++) {
            if (sum < target) {
                sum += nums[windowEnd];
            }

            while (sum >= target) {
                minWindow = Math.min(minWindow, windowEnd - windowStart + 1);
                sum -= nums[windowStart++];
            }
        }

        return minWindow == Integer.MAX_VALUE ? 0 : minWindow;
    }
}