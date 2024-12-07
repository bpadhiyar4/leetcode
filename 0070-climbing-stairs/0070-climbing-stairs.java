class Solution {
    public int climbStairs(int n) {
        if (n == 1) {
            return 1;
        }

        int last = 1;
        int secondLast = 1;
        for(int i=n-3; i>=0; i--) {
            int temp = last + secondLast;
            last = secondLast;
            secondLast = temp;
        }

        return last + secondLast;
    }
}