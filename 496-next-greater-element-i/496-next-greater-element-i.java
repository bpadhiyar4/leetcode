class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];
        Arrays.fill(ans, -1);
        
        Deque<Integer> decStack = new LinkedList<>();
        int count = 0;
        
        for(int index = nums2.length -1; index >= -1; index--) {
            
            while(!decStack.isEmpty() && (index == -1 || nums2[decStack.peek()] < nums2[index])) {
                int popIndex = decStack.pop();
                if(!decStack.isEmpty()) {
                    int prevIndex = decStack.peek();
                    int indexForAns = getIndex(nums1, nums2[popIndex]);
                    
                    if(indexForAns != -1) {
                        ans[indexForAns] = nums2[prevIndex];
                        count++;
                    }
                }
                
                if(count == nums1.length) {
                        return ans;
                }
            } 
            
            decStack.push(index);
        }
        
        return ans;
    }
    
    private int getIndex(int[] nums, int ele) {
        
        for(int i=0;i<nums.length; i++) {
            if(nums[i] == ele) {
                return i;
            }
        }
        
        return -1;
    }
}