class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0, j=0;
        
        if (m+n <= 1) {
            if (m == 0) {
                nums1[0] = nums2[0];
            }
            
            return;
        }
        
        for(; i<m+n && j != n; i++) {
            if (nums2[j] <= nums1[i]) {
                for(int k=m+j; k > i; k--) {
                    nums1[k] = nums1[k-1];
                }
                nums1[i] = nums2[j++];
            }
        }
        
        if (j != n) {
            while (j<n) {
                nums1[i-(n-j)] = nums2[j++];
            }
        }
    }
}
