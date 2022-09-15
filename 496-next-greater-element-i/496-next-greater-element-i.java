class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        // Initially fill answer array with the -1.
        int[] ans = new int[nums1.length];
        Arrays.fill(ans, -1);
        
        // Create index map for nums1 to avoid multiple search.
        Map<Integer, Integer> indexMap = new HashMap<>();
        for(int index=0;index<nums1.length;index++) {
            indexMap.put(nums1[index], index);
        }
        
        // Decreasing monotonic stack to find next greater or previous greater.
        Deque<Integer> decStack = new LinkedList<>();
        
        // start loop from the end of array and traverse towards the left to get the next greater element.
        for(int index = nums2.length -1; index >= -1; index--) {
            
            while(!decStack.isEmpty() && (index == -1 || nums2[decStack.peek()] < nums2[index])) {
                int popIndex = decStack.pop();
                
                // if stack is not empty it means the current peek element was the next greater for the poped element.
                if(!decStack.isEmpty()) {
                    int prevIndex = decStack.peek();
                    
                    // check wheather poped element was present in the nums1.
                    // if it present then get the index from index map and update the answer array with 
                    // the stack's top which is the next greater element.
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