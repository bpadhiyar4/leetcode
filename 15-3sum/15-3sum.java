class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        
        Arrays.sort(nums);
        for(int id1 = 0; id1 < nums.length -2;id1++) {
            
            if(id1 > 0 && nums[id1] == nums[id1-1]) {
                continue;
            }
            
            int id2 = id1+1;
            int id3 = nums.length-1;
            
            while(id2 < id3) {
                int sum = nums[id1] + nums[id2] + nums[id3];
                
                if(sum == 0) {
                    ans.add(Arrays.asList(nums[id1], nums[id2], nums[id3]));
                    
                    id3--;
                    
                    while(id2 < id3 && nums[id3] == nums[id3+1]) {
                        id3--;
                    }
                } else if(sum > 0) {
                    id3--;
                } else {
                    id2++;
                }
            }
        }
        
        return ans;
    }
}