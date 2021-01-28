class Solution {
    public int[] replaceElements(int[] arr) {
        int len = arr.length;
        int max = arr[len-1];
        
        arr[len-1] = -1;
        
        for (int i=len-2;i>=0;i--) {
            int temp = max;
            if (arr[i] > max) {
                temp = arr[i];
            }
            
            arr[i] = max;
            max=temp;
        }
        
        return arr;
    }
}