class Solution {

    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        subset(0, nums, new ArrayList<>());
        return ans;
    }

    private void subset(int index, int[] nums, List<Integer> subset) {
        if (index == nums.length) {
            // add into ans list.
            ans.add(new ArrayList<>(subset));
            return;
        }

        // Add
        subset(index+1, nums, subset);
        subset.add(nums[index]);
        subset(index+1, nums, subset);
        subset.remove(subset.size() -1);
    }
}