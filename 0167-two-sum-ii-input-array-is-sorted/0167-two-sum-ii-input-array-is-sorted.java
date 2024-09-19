class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int len = numbers.length;
        int first = 0;
        int second = len - 1;

        while(first < second) {
            int sum = numbers[first] + numbers[second];
            if (sum == target) {
                return new int[] { first + 1, second + 1};
            } else if (sum < target) {
                first++;
            } else {
                second--;
            }
        }

        return new int[] {first + 1, second + 1};
    }
}