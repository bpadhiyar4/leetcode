class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int len = gas.length;
        int gasSum = 0;
        int costSum = 0;
        int tank = 0;
        int ans = 0;
        for (int i=0; i<len;i++) {
            gasSum += gas[i];
            costSum += cost[i];

            tank += gas[i] - cost[i];
            if (tank < 0) {
                ans = i + 1;
                tank = 0;
            }
        }

        if (gasSum < costSum) {
            return -1;
        }

        return ans;
    }
}