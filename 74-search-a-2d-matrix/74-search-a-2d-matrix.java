class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int r = matrix.length;
        int c = matrix[0].length;
        
        for(int i=0; i<r;i++) {
            // to Find particular row containing targeted element.
            if(matrix[i][0] <= target && target <= matrix[i][c-1]) {
                
                // Search using binary search to improve the search in row.
                return search(matrix[i], target);
            }
        }
        
        return false;
    }
    
    // iterative binary search approach.
    private boolean search(int[] arr, int target) {
        int low = 0;
        int high = arr.length-1;
        
        while(high - low > 1) {
            int mid = (low+high) / 2;
            if(arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        
        return (arr[low] == target || arr[high] == target);
    }
}