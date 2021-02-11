class Solution {
    public int[] sortArrayByParity(int[] A) {
        if (A.length <2) {
            return A;
        }
        
        int start = 0;
        int end = A.length-1;
        
        int[] ans = new int[A.length];
        int i =0;
        while (start <= end && end > -1) {
            if (A[i] % 2 == 0) {
                ans[start++] = A[i++];
            } else {
                ans[end--] = A[i++];
            }
        }
        
        return ans;
    }
}