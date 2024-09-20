class Solution {
    public int maxArea(int[] height) {
        int len = height.length;
        int max = 0;
        int i = 0;
        int j = len - 1;

        while(i < j) {
            int level = Math.min(height[i], height[j]);
            max = Math.max(max, level * (j-i));
            if (height[j] < height[i]) {
                j--;
            } else {
                i++;
            }
        }
        return max;
    }
}