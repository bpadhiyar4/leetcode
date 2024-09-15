class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int len = gas.length;
        int gasSum = 0;
        int costSum = 0;

        for (int i=0; i<len;i++) {
            gasSum += gas[i];
            costSum += cost[i];
        }

        if (gasSum < costSum) {
            return -1;
        }

        for (int i=0;i<len;i++) {

            if (gas[i] == 0 || cost[i] > gas[i]) {
                continue;
            }

            int tank = 0;
            int curr = i;
            boolean start = true;
            while (true) {
                if (!start && curr == i) {
                    return i;
                }
                tank += gas[curr];
                int nextCost = cost[curr];
                start = false;
                if (nextCost > tank) {
                    break;
                } else {
                    tank -= nextCost;
                    curr = (curr + 1) % len;
                }
            }
        }

        return -1;
    }
}