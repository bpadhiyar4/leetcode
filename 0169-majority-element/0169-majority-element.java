class Solution {
    public int majorityElement(int[] nums) {
        int freq = 0;
        int majorElement = 0;

        for(int num : nums) {
            if (freq == 0) {
                majorElement = num;
            }

            if (num == majorElement) {
                freq++;
            } else {
                freq--;
            }
        }

        return majorElement;
    }
}