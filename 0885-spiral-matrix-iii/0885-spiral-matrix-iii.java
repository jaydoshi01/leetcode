class Solution {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int[][] result = new int[rows * cols][2];
        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}}; // Right, Down, Left, Up

        int index = 0;
        int steps = 1;

        result[index++] = new int[]{rStart, cStart};

        while (index < rows * cols) {
            // Go right
            for (int j = 0; j < steps; j++) {
                cStart += directions[0][1];
                if (isValidPosition(rStart, cStart, rows, cols)) {
                    result[index++] = new int[]{rStart, cStart};
                }
            }

            // Go down
            for (int j = 0; j < steps; j++) {
                rStart += directions[1][0];
                if (isValidPosition(rStart, cStart, rows, cols)) {
                    result[index++] = new int[]{rStart, cStart};
                }
            }

            // Go left
            for (int j = 0; j < steps + 1; j++) {
                cStart += directions[2][1];
                if (isValidPosition(rStart, cStart, rows, cols)) {
                    result[index++] = new int[]{rStart, cStart};
                }
            }

            // Go up
            for (int j = 0; j < steps + 1; j++) {
                rStart += directions[3][0];
                if (isValidPosition(rStart, cStart, rows, cols)) {
                    result[index++] = new int[]{rStart, cStart};
                }
            }

            // Increase steps after completing a round
            steps += 2;
        }

        return result;
    }

    private boolean isValidPosition(int row, int col, int rows, int cols) {
        return row >= 0 && row < rows && col >= 0 && col < cols;
    }
}
