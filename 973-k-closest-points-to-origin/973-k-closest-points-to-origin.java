class Solution {
    public int[][] kClosest(int[][] points, int k) {
//         List<int[]> list = new ArrayList<>();
        
//         for(int[] point : points) {
//             int distance = point[0] * point[0] + point[1] * point[1];
//             list.add(new int[] {distance, point[0], point[1]});
//         }
        
        Arrays.sort(points, (p1, p2) -> {
            return (p1[0]*p1[0] + p1[1]*p1[1]) - (p2[0]*p2[0] + p2[1]*p2[1]);
        });
        
        int[][] ans = new int[k][2];
        
        for(int i=0;i<k;i++) {
            ans[i] = new int[] {points[i][0], points[i][1]};
        }
        
        return ans;
    }
}