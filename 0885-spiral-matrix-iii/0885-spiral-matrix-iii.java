class Solution {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int[][] result = new int[rows * cols][2];
        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}}; // Right, Down, Left, Up

        int index = 0;
        int steps = 1;

        result[index++] = new int[]{rStart, cStart};

        while (index < rows * cols) {
            for (int i = 0; i < 4; i++) {
                int[] direction = directions[i];

                for (int j = 0; j < steps; j++) {
                    rStart += direction[0];
                    cStart += direction[1];

                    if (isValidPosition(rStart, cStart, rows, cols)) {
                        result[index++] = new int[]{rStart, cStart};
                        
                        if (index == rows * cols) {
                            return result;
                        }
                    }
                }

                if (i % 2 == 1) {
                    steps++; // Increase steps after moving in both horizontal and vertical directions
                }
            }
        }

        return result;
    }

    private boolean isValidPosition(int row, int col, int rows, int cols) {
        return row >= 0 && row < rows && col >= 0 && col < cols;
    }
}
