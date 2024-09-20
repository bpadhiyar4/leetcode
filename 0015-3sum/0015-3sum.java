class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int len = nums.length;

        List<List<Integer>> triplet = new ArrayList<>();
        Arrays.sort(nums);
        for (int i=0; i < len - 2; i++) {
            if (i != 0 && nums[i] == nums[i-1]) {
                continue;
            }

            int j = i + 1;
            int k = len - 1;
            int target = 0 - nums[i];

            while (j < k) {
                int sum = nums[j] + nums[k];
                if (sum == target) {
                    triplet.add(List.of(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                    while(j < k && nums[j] == nums[j-1]) {
                        j++;
                    }

                    while(j<k && nums[k] == nums[k+1]) {
                        k--;
                    }
                } else if (sum > target) {
                    k--;
                } else {
                    j++;
                }
            }
        }

        return triplet;
    }
}