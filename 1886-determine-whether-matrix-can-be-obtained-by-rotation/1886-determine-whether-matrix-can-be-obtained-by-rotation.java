// class Solution {
//     public boolean findRotation(int[][] mat, int[][] target) {
//         for(int i = 0;i < 4; i++) {
//             if(checkEquality(mat,target)) {
//                 return true;
//             }
//         }
//         return false;
//     }
//     boolean checkEquality(int[][] mat, int[][] target) {
//         int n = mat.length;
//         for(int i = 0; i < n/2; i++) {
//             for(int j = i; j < n - 1 - i; j++) {
//                 int temp = mat[i][j];
//                 mat[i][j] = mat[n - 1 - j][i];
//                 mat[n - 1 - j][i] = mat[n - i - 1][n-1-j];
//                 mat[n - 1 - i][n - 1 - j] = mat[j][n-1-i];
//                 mat[j][n - 1 - i] = temp;
//             }
//         }
//         for(int i = 0; i < mat.length; i++) {
//             for(int j = 0; j < mat.length; j++) {
//                 if(target[i][j] != mat[i][j])
//                     return false;
//             }
//         }
//         return true;
//     }
// }





// This code is 100% Faster 24 Oct 2022 don't know about future
// If not understanding how to solve ping me with problem no and doubt 
// sahil2001bassan@gmail.com

// For rotating a matrix 90 degree we need to first transpose the matrix then swapping element 
// of 0th coloumn with n-1 coloumn , 1st col with n-2 col and so on 
//         We will Rotate 3 times
//         No need to rotate 4th time because it will become same matrix after 4th time
//         We have already done the check if the mat = target return true
//                    Kindly UPVOTE If it helps and DOWNVOTE if any issue with the code

class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
     
        for(int i=0; i<4; i++){
        if(isEqual(mat,target)) return true;
        mat = rotate(mat);
        }
        return false;
    }
    
    
//     Function to rotate matrix by 90 degree using transpose
    public static int[][] rotate(int[][] mat){
          int[][] check = mat;   
          int m = check.length;
//             First transposing the matrix
            for(int col=0; col<m; col++){
                for(int row=1+col; row<m; row++){
                    int temp = check[row][col];
                    check[row][col] = check[col][row];
                    check[col][row] = temp;
                }
            }
        
//             Now swapping coloumns like said in start
            for(int col_1 = 0 , col_2=m-1; col_1<m/2; col_1++,col_2--){
            for(int row= 0; row<m; row++){
                int temp = check[row][col_1];
                check[row][col_1] = check[row][col_2];
                check[row][col_2] = temp;;
            }
        }
        return check;
    }
    
    
//     Function to check whether two matrix are equal
    public static boolean isEqual(int[][] m1 , int[][] m2){
        if(m1.length != m2.length) return false;
        if(m1[0].length != m2[0].length) return false;
        for(int row=0; row<m1.length; row++){
            for(int col = 0; col<m1[0].length; col++){
                if(m1[row][col] != m2[row][col]) return false;
            }
        }
        return true;
    }
    
}