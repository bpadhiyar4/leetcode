class Solution {
    public int[] sortedSquares(int[] nums) {
        int sqrArray[] = new int[nums.length];
        
        for(int i=0; i< nums.length; i++) {
            sqrArray[i] = nums[i] * nums[i];
        }
        Arrays.sort(sqrArray);
        return sqrArray;
    }
}
