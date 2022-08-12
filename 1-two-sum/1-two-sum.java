class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> indexMap = new HashMap<>();
        
        for(int i=0; i< nums.length; i++) {
            int next = target - nums[i];
            if(indexMap.containsKey(next)) {
                return new int[] {indexMap.get(next), i};
            }
            
            indexMap.put(nums[i], i);
        }
        
        return null;
    }
}