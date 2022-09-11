class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
    List<List<Integer>> ans = new ArrayList<>();
    if(nums.length<4)
        return ans;
    Arrays.sort(nums);
    if(nums[0]>0 && target<0)
        return ans;
    for(int i=0;i<nums.length;i++){
        
        while(i!=0 && i<nums.length && nums[i]==nums[i-1])
            ++i;
        for(int j=i+1;j<nums.length;j++){
            while(j<nums.length && j-1!=i && nums[j]==nums[j-1])
                ++j;
            
            int low = j+1;
            int high=nums.length-1;
            while(low<high){
                
                if(nums[i]+nums[j]+nums[low]+nums[high]==target){
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(nums[low]);
                    list.add(nums[high]);
                    ans.add(list);
                    while(low<high && nums[low]==nums[low+1])
                        ++low;
                    while(low<high && nums[high]==nums[high-1])
                        --high;
                    
                    ++low;
                    --high;
                }else if (nums[i]+nums[j]+nums[low]+nums[high]<target)
                    ++low;
                else
                    --high;
            }
        }
    }
        
    
    return ans;
    }
}