class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int len = numbers.length;
        Map<Integer, Integer> indexMap = new HashMap<>(); 
        int first = 0, second = 0;
        for (int i = 0; i < len; i++) {
            indexMap.put(numbers[i], i+1);
        }

        for (int i = 0; i < len; i++) {
            int j = indexMap.getOrDefault(target - numbers[i], -1);
            if (j != -1) {
                first = i + 1;
                second = j;
                break;
            }
        }
        return new int[] {first, second};
    }
}