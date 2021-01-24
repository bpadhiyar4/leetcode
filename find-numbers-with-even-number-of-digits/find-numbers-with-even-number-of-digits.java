class Solution {
    public int findNumbers(int[] nums) {
        int evenNum =0;
        
        for (int n : nums) {
            int len = numLength(n);
            if (len % 2 == 0) 
                evenNum++;    
        }
        
        return evenNum;
    }
    
    private int numLength(int n) {
        int l =1;
        
        while (n > 9) {
            n = n /10;
            l++;
        }
        
        return l;
    }
}
