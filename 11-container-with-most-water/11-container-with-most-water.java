class Solution {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int left = 0;
        int right = height.length -1;
        
        while(left < right) {
            int curArea = Math.min(height[left], height[right]) * (right - left);
            if(curArea > maxArea) {
                maxArea = curArea;
            }
            
            if(height[left] > height[right]) {
                right--;
            } else {
                left++;
            }
        }
        
        return maxArea;
    }
}