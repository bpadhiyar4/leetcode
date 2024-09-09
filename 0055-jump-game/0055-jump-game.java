class Solution {
    public boolean canJump(int[] nums) {
        int reachable = 0;
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            if (i > reachable) {
                return false;
            }

            reachable  = Math.max(reachable, i + nums[i]);
        }

        return true;
    }
}