class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int len = numbers.length;

        for (int i=0; i < len - 1; i++) {
            int expectedSecond = target - numbers[i];
            for (int j = i+1; j < len; j++) {
                int secondNumber = numbers[j];
                if (secondNumber == expectedSecond) {
                    return new int[]{i+1, j+1};
                } else if (secondNumber > expectedSecond) {
                    break;
                }
            }
        }

        return new int[]{0, 1};
    }
}