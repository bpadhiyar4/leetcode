class Solution {
    public boolean isValidSudoku(char[][] board) {
        List<Set<Integer>> rows = new ArrayList<>();
        List<Set<Integer>> cols = new ArrayList<>();

        for (int i = 0; i < 9; i++) {
            rows.add(new HashSet<>());
            cols.add(new HashSet<>());
        }

        for (int x = 0; x < 9; x = x + 3) {
            for (int y = 0; y < 9; y = y + 3) {
                Set<Integer> box = new HashSet<>();

                for (int i = x; i < x + 3; i++) {
                    for (int j = y; j < y + 3; j++) {
                        if (board[i][j] != '.') {
                            int n = Character.getNumericValue(board[i][j]);
                            Set<Integer> row = rows.get(i);
                            Set<Integer> col = cols.get(j);
                            if (box.contains(n) || row.contains(n) || col.contains(n)) {
                                return false;
                            } else {
                                row.add(n);
                                col.add(n);
                                box.add(n);
                            }
                        }
                    }
                }
            }
        }
        return true;
    }
        
}