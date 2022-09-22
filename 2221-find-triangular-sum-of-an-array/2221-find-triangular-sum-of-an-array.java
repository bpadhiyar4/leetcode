class Solution {
    public int triangularSum(int[] nums) {
        int len = nums.length;
        
        for(int i=0;i<len;i++) {
            for(int j=len-1;j>i;j--) {
                nums[j] = (nums[j] + nums[j-1]) % 10;
            }
        }
        
        return nums[len-1];
    }
}