class Solution {
    public boolean isValidSudoku(char[][] board) {
        return parse(board, new ArrayList<>(), new ArrayList<>());
    }
    
    boolean parse(char[][] board, List<Set<Integer>> rows, List<Set<Integer>> cols) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                Set<Integer> row;
                Set<Integer> col;
                if (i == 0) {
                    col = new HashSet<>();
                    cols.add(col);
                } else {
                    col = cols.get(j);
                }

                
                if (j == 0) {
                    row = new HashSet<>();
                    rows.add(row);
                } else {
                    row = rows.get(i);
                }

                if (board[i][j] != '.') {
                    int n = Character.getNumericValue(board[i][j]);
                    if (row.contains(n) || col.contains(n)) {
                        return false;
                    } else {
                        row.add(n);
                        col.add(n);
                    }
                }
                
                if ((i % 3 == 0 && j % 3 == 0) && !isValidBox(i, j, board)) {
                    return false;
                }
            }
        }

        return true;
    }
    
    boolean isValidBox(int x, int y, char[][] board) {
        Set<Integer> box = new HashSet<>();
        for (int i = x; i < x + 3; i++) {
            for (int j = y; j < y + 3; j++) {
                if (board[i][j] != '.') {
                    int n = Character.getNumericValue(board[i][j]);
                    if (box.contains(n)) {
                        return false;
                    } else {
                        box.add(n);
                    }
                }
            }
        }
        return true;
    }
}