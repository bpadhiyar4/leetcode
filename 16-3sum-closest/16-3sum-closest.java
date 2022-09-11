class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int minDiff = Integer.MAX_VALUE;
        int minSum = 0;
        
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++) {
            
            if(i > 0 && nums[i] == nums[i-1]) {
                continue;
            }
            
            int j = i+1;
            int k = nums.length-1;
            
            while(j<k) {
                
                int curSum = nums[i] + nums[j] + nums[k];
                int curDiff;
                
                if(curSum == target) {
                    return curSum;
                }

                if(curSum > target) {
                    curDiff = curSum - target;
                } else {
                    curDiff = target - curSum;
                }

                if(Math.abs(curDiff) < Math.abs(minDiff)) {
                    minDiff = curDiff;
                    minSum = curSum;
                }
                
                if(curSum > target) {
                    k--;
                } else {
                    j++;
                }
            }
        }
        
        return minSum;
    }
}