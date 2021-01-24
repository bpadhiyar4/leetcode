class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max =0;
        int cons =0;
    
        for (int i =0 ; i <nums.length; i++) {
            if (nums[i] == 1) 
                cons++;
            
            if (max <= cons) 
                max = cons;
            
            
            if (nums[i] != 1) 
                cons =0;
            
        }
        
        return max;
        
    }
}
​
