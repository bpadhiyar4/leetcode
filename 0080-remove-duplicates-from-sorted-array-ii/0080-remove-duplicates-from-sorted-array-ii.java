class Solution {
    public int removeDuplicates(int[] nums) {
        int newIndex = 1;
        boolean hasDuplicate = false;
        int len = nums.length;
        for (int i = 1; i < len; i++) {
            if (nums[i] == nums[i-1]) {
                if (!hasDuplicate) {
                    nums[newIndex++] = nums[i];
                    hasDuplicate = true;
                } 
            } else {
                hasDuplicate = false;
                nums[newIndex++] = nums[i];
            }
        }

        return newIndex;
    }
}