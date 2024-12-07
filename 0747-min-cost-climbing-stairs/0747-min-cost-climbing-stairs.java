class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] pathCost = new int[n];
        pathCost[n-1] = cost[n-1];
        pathCost[n-2] = cost[n-2];

        for(int i=n-3; i>=0; i--) {
            pathCost[i] = Math.min(
                cost[i] + pathCost[i+1],
                cost[i] + pathCost[i+2]
            );
        }
        
        return Math.min(pathCost[0], pathCost[1]);   
    }
}