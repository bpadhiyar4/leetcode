class Solution {
    public int jump(int[] nums) {
        int reach = 0;
        int jump = 0;
        int maxIndex = 0;
        int len = nums.length;
        for(int i = 0; i<len-1; i++) {
            maxIndex = Math.max(maxIndex, i + nums[i]);
            if (i == reach) {
                jump++;
                reach = maxIndex;
                if (reach >= len - 1) {
                    break;
                }
            }
        }

        return jump;
    }
}