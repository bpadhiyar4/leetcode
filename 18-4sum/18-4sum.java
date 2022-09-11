class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        
        Arrays.sort(nums);
        
        for(int i=0;i<nums.length - 3; i++) {
            while(i>0 && i < nums.length - 3 && nums[i] == nums[i-1]) {
                i++;
            }
            
            for(int j = i+1; j<nums.length -2;j++) {
                while(j > i+1 && j<nums.length-2 && nums[j] == nums[j-1]) {
                    j++;
                }

                int k = j+1;
                int l = nums.length -1;
                
                while(k<l) {
                    if( (long)nums[i] + nums[j] + nums[k] + nums[l] == target) {
                        ans.add(Arrays.asList(nums[i], nums[j], nums[k], nums[l]));
                        
                        while(k < l && nums[k] == nums[k+1]) {
                            k++;
                        } 
                        
                        while(k < l && nums[l] == nums[l-1]) {
                            l--;
                        }
                        
                        k++;
                        l--;
                    } else if((long)nums[i] + nums[j] + nums[k] + nums[l] > target){
                        l--;
                    } else {
                        k++;
                    }
                }
            }
        }
        
        return ans;
    }
}