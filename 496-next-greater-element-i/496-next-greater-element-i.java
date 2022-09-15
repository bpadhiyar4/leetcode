class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];
        Arrays.fill(ans, -1);
        
        Deque<Integer> decStack = new LinkedList<>();
        
        Map<Integer, Integer> indexMap = new HashMap<>();
        
        for(int index=0;index<nums1.length;index++) {
            indexMap.put(nums1[index], index);
        }
        
        for(int index = nums2.length -1; index >= -1; index--) {
            
            while(!decStack.isEmpty() && (index == -1 || nums2[decStack.peek()] < nums2[index])) {
                int popIndex = decStack.pop();
                if(!decStack.isEmpty()) {
                    int prevIndex = decStack.peek();
                    int indexForAns = indexMap.getOrDefault(nums2[popIndex], -1);

                    if(indexForAns != -1) {
                        ans[indexForAns] = nums2[prevIndex];
                    }
                }
            } 
            
            decStack.push(index);
        }
        
        return ans;
    }
}