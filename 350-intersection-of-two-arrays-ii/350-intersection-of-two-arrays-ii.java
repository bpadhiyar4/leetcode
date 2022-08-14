class Solution {

    // Approach A
    // TIme Complexity : O(NLogN), because we are performing sorting.
    // Space complexity : O(1), don't need any extra space except the list to store the answer.
     public int[] intersect(int[] nums1, int[] nums2) {
         Arrays.sort(nums1);
         Arrays.sort(nums2);
         
         int n1 = nums1.length;
         int n2 = nums2.length;
         int i=0;
         int j=0;
         List<Integer> ans = new ArrayList<>();
         while(i<n1 && j<n2) {
             if(nums1[i] == nums2[j]) {
                 ans.add(nums1[i]);
                 i++;
                 j++;
             } else {
                 if(nums1[i] < nums2[j]) {
                     i++;
                 } else {
                     j++;
                 }
             }
         }
         
         return ans.stream()
            .mapToInt(Integer::intValue)
            .toArray();
    }
    
    // Approach B
    // TIme complexity : O(n1 + n2), where n1 n2 represents nums1 and nums2's length respectively
    // Space complexity : O(n2), for HashMap.
    public int[] intersectApproachB(int[] nums1, int[] nums2) {

        if(nums1.length < nums2.length) {
            return intersect(nums2, nums1);
        }
        
        Map<Integer, Integer> map = new HashMap<>();
        for(int n : nums2) {
            int count = map.getOrDefault(n, 0);
            map.put(n, ++count);
        }
        
        List<Integer> ans = new ArrayList<>();
        for(int n: nums1) {
            int count = map.getOrDefault(n, 0);
            if(count > 0) {
                ans.add(n);
                map.put(n, --count);
            }
        }
        
        return ans.stream()
            .mapToInt(Integer::intValue)
            .toArray();
    }
}