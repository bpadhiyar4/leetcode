class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        m--;
        n--;
        
        int k = nums1.length - 1;
        
        while(m >=0 && n>=0) {
            nums1[k--] = nums1[m] > nums2[n] ? nums1[m--] : nums2[n--];
        }
        
        while(n >= 0) {
            nums1[k--] = nums2[n--];
        }
    }
}