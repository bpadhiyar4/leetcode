class Solution {
    public int[] minOperations(String boxes) {
        int len = boxes.length();

        List<Integer> indexes = new ArrayList<>();
        for (int i=0;i<len;i++) {
            if (boxes.charAt(i) == '1') {
                indexes.add(i);
            }
        }

        int[] ans = new int[len];
        for (int i=0; i<len;i++) {
            for (int index: indexes) {
                ans[i] += Math.abs(i-index);
            }
        }

        return ans;
    }
}