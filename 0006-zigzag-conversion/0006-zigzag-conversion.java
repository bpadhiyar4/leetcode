class Solution {
    public String convert(String s, int numRows) {
        int len = s.length();
        if (numRows == 1 || len == numRows) {
            return s;
        }

        boolean down = true;
        StringBuilder[] matrix = new StringBuilder[numRows];
        for (int i=0; i < numRows; i++) {
            matrix[i] = new StringBuilder();
        }

        int j = 0;
        for (int i=0; i < len; i++) {
            matrix[j].append(s.charAt(i));
            if (j == numRows - 1) {
                down = false;
            } else if (j == 0) {
                down = true;
            }

            if (down) {
                j++;
            } else {
                j--;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (StringBuilder row : matrix) {
            sb.append(row);
        }

        return sb.toString();
    }
}