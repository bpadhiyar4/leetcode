class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int max = nums[0];
        
        for(int n : nums) {
            if(sum < 0) {
                sum = 0;
            }
            sum += n;            
            max = Math.max(sum, max);
        }
        
        return max;
    }
    
//         public int maxSubArray(int[] nums) {
//         int max = Integer.MIN_VALUE;
//         int len = nums.length;
        
//         if(len == 1) {
//             return nums[0];
//         }
        
//         for(int i=0; i<len; i++) {
//             int sum = nums[i];
//             max = Math.max(max, sum);
//             for(int j=i+1; j< len; j++) {
//                 sum += nums[j];
                
//                 max = Math.max(max, sum);
//             }
            
//         }
        
//         return max;
//     }
}