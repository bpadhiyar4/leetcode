class Solution {

    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        subset(0, nums, new ArrayList<>());
        return ans;
    }

    private void subset(int index, int[] nums, List<Integer> subset) {
        if (index == nums.length) {
            ans.add(new ArrayList<>(subset));
            return;
        }

        subset.add(nums[index]);
        subset(index+1, nums, subset);
        subset.remove(subset.size() - 1);

        while (index+1 < nums.length && nums[index] == nums[index+1]) {
            index++;
        }
        subset(index+1, nums, subset);;
    }
}