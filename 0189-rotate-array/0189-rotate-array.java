class Solution {
    public void rotate(int[] nums, int k) {
        int len = nums.length;

        k = k % len;
        int[] shiftArray = new int[k];

        for (int i = len - 1, j=0; i >=0 && j < k; i--, j++) {
            shiftArray[j] = nums[i];
        }

        for (int i = len - 1 - k; i >= 0; i--) {
            nums[i + k] = nums[i];
        }

        for (int i= k-1, j=0; i >= 0 && i < shiftArray.length; i--, j++) {
            nums[j] = shiftArray[i];
        }
    }
}