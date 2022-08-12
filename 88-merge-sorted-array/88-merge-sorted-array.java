class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        m--;
        n--;
        
        int k = nums1.length - 1;
        
        //compare nums1, nums2 and keep placing the largest element in the kth position
        while(m >=0 && n>=0) {
            nums1[k--] = nums1[m] > nums2[n] ? nums1[m--] : nums2[n--];
        }
        
        //If there are elements in nums1, we don't have do anything since it is already sorted
		//If there are elements in nums2, keep placing them in the front
        while(n >= 0) {
            nums1[k--] = nums2[n--];
        }
    }
}