class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1 || s.length() == numRows) {
            return s;
        }

        boolean down = false;
        StringBuilder[] matrix = new StringBuilder[numRows];
        for (int i=0; i < numRows; i++) {
            matrix[i] = new StringBuilder();
        }

        int len = s.length();
        int j = 0;
        for (int i=0; i < len; i++) {
            matrix[j].append(s.charAt(i));
            if (j == numRows - 1 || j == 0) {
                down = !down;
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