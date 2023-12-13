class Solution {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int[][] matrix = new int[rows * cols][2];
        int k = 0;

        int rowEnd = rStart + 1;
        int colEnd = cStart + 1;

        while (true) {
            // Right
            for (int i = cStart; i <= colEnd; i++) {
                if (isValidPosition(rStart, i, rows, cols)) {
                    matrix[k++] = new int[]{rStart, i};
                }
            }
            cStart--;
            colEnd++;

            if (k == matrix.length) break;

            // Down
            for (int i = rStart + 1; i <= rowEnd; i++) {
                if (isValidPosition(i, colEnd - 1, rows, cols)) {
                    matrix[k++] = new int[]{i, colEnd - 1};
                }
            }
            rStart--;
            rowEnd++;

            if (k == matrix.length) break;

            // Left
            for (int i = colEnd - 2; i >= cStart; i--) {
                if (isValidPosition(rowEnd - 1, i, rows, cols)) {
                    matrix[k++] = new int[]{rowEnd - 1, i};
                }
            }

            if (k == matrix.length) break;

            // Up
            for (int i = rowEnd - 2; i > rStart; i--) {
                if (isValidPosition(i, cStart, rows, cols)) {
                    matrix[k++] = new int[]{i, cStart};
                }
            }

            if (k == matrix.length) break;
        }
        return matrix;
    }

    private boolean isValidPosition(int row, int col, int rows, int cols) {
        return row >= 0 && row < rows && col >= 0 && col < cols;
    }
}
