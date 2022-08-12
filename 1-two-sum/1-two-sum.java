class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> indexMap = new HashMap<>();
        
        for(int i=0;i<nums.length; i++) {
            indexMap.put(nums[i], i);
        }
        
        for(int i=0;i<nums.length;i++) {
            int nextNumIndex = indexMap.getOrDefault(target - nums[i], -1);
            
            if(nextNumIndex != -1 && nextNumIndex != i) {
                return new int[] {i, nextNumIndex};
            }
        }
        
        return null;
    }
}