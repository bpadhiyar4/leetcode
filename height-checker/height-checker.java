class Solution {
    public int heightChecker(int[] heights) {
        
        int[] copiedArray = Arrays.copyOf(heights, heights.length);
        
        Arrays.sort(copiedArray);
        
        int minimumStep = 0;
        for (int i=0; i<heights.length; i++) {
            if (heights[i] != copiedArray[i]) {
                minimumStep++;
            }
        }
        
        return minimumStep;
        
    }
}