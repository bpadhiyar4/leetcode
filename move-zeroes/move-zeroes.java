class Solution {
    public void moveZeroes(int[] nums) {
        int read=0, write=0;
        
        for (;read<nums.length;read++) {
            if (nums[read] != 0) {
                nums[write++] = nums[read];
            }
        }
        
        if (write != nums.length) {
            for (int i=write; i<nums.length;i++) {
                nums[i] = 0; 
            }
        }
    }
}