class Solution {
    public String convert(String s, int numRows) {
        boolean down = true;
        List<Character>[] matrix = new List[numRows];
        for (int i=0; i < numRows; i++) {
            matrix[i] = new ArrayList<>();
        }

        int len = s.length();
        int j = 0;
        for (int i=0; i < len; i++) {
            matrix[j].add(s.charAt(i));
            if (j == numRows - 1) {
                down = false;
            } else if (j == 0) {
                down = true;
            }

            if (numRows != 1 && down) {
                j++;
            } else if (numRows != 1){
                j--;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (List<Character> row : matrix) {
            for(Character ch : row) {
                sb.append(ch);
            }
        }

        return sb.toString();
    }
}