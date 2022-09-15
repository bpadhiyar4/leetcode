class Solution {
    public long subArrayRanges(int[] nums) {
        Stack<Integer> decStack = new Stack<>();
        Stack<Integer> incStack = new Stack<>();
        
        long sum = 0;
        
        for(int i=0;i<=nums.length;i++) {
            sum += pushToStack(decStack, nums, i, (a,b) -> a < b) - pushToStack(incStack, nums, i, (a,b) -> a > b);
        }
        
        return sum;
    }
    
    private long pushToStack(Stack<Integer> stack, int[] nums, int index, BiFunction<Integer, Integer, Boolean> compare) {
        long sum = 0;
        
        while(!stack.isEmpty() && (index == nums.length || compare.apply(nums[stack.peek()], nums[index]))) {
            int popIndex = stack.pop();
            int prevIndex = stack.isEmpty() ? -1 : stack.peek();
            
            sum += (popIndex - prevIndex) * (index - popIndex) * (long)nums[popIndex];
        }
        
        stack.push(index);
        
        return sum;
    }
}