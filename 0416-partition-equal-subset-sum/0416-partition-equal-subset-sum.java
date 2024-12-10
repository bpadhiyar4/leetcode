class Solution {
    public boolean canPartition(int[] nums) {
        int len = nums.length;
        int sum = 0;

        for(int n: nums) {
            sum += n;
        }
        
        if (sum % 2 != 0) {
            return false;
        }

        int target = sum / 2;
        Set<Integer> dp = new HashSet<>();
        dp.add(0);
        for (int n: nums) {
            Set<Integer> nextDp = new HashSet<>();
            for(int dpNum : dp) {
                nextDp.add(dpNum + n);
            }

            dp.addAll(nextDp);
        }

        return dp.contains(target);
    }
}