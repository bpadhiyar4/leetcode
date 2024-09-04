class Solution {
    public int removeDuplicates(int[] nums) {
        int newIndex = 1;
        int len = nums.length;
        for (int i = 1; i < len; i++) {
            if (newIndex == 1 || nums[i] != nums[newIndex - 2]) {
                nums[newIndex++] = nums[i];
            }
        }

        return newIndex;
    }
}