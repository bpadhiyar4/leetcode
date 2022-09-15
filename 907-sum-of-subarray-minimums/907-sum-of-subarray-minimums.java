class Solution {
    public int sumSubarrayMins(int[] arr) {
        
        int MOD = (int) 1e9 + 7;
        Deque<Integer> incStack = new LinkedList<>();
        
        long sum = 0;

        for(int i=0;i<=arr.length;i++) {
            while(!incStack.isEmpty() && (i == arr.length || arr[incStack.peek()] > arr[i])) {
                int popIndex = incStack.pop();
                int prevIndex = incStack.isEmpty() ? -1 : incStack.peek();
                sum = (sum + (long)(popIndex - prevIndex) * (i - popIndex) * arr[popIndex]) % MOD;       
            }
    
            incStack.push(i);
        }

        return (int)sum;
    }
}