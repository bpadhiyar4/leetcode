class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        solve(nums, ans, 0);
        return ans;
    }
    
    
    private void solve(int[] nums, List<List<Integer>> ans, int index) {
        if(index >= nums.length)  {
            ans.add(Arrays.stream(nums).boxed().toList());
            return;
        } 
        
        int len = nums.length;
        for(int next=index; next < len; next++) {
            int temp = nums[index];
            nums[index] = nums[next];
            nums[next] = temp;

            solve(nums, ans, index+1);

            temp = nums[index];
            nums[index] = nums[next];
            nums[next] = temp;
        }
    }
}