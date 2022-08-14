class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {

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