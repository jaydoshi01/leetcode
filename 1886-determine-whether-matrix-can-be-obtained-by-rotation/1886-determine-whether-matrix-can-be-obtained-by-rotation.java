class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        for(int i = 0;i < 4; i++) {
            if(checkEquality(mat,target)) {
                return true;
            }
        }
        return false;
    }
    boolean checkEquality(int[][] mat, int[][] target) {
        int n = mat.length;
        for(int i = 0; i < n/2; i++) {
            for(int j = i; j < n - 1 - i; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[n - 1 - j][i];
                mat[n - 1 - j][i] = mat[n - i - 1][n-1-j];
                mat[n - 1 - i][n - 1 - j] = mat[j][n-1-i];
                mat[j][n - 1 - i] = temp;
            }
        }
        for(int i = 0; i < mat.length; i++) {
            for(int j = 0; j < mat.length; j++) {
                if(target[i][j] != mat[i][j])
                    return false;
            }
        }
        return true;
    }
}