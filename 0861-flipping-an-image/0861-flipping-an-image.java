// class Solution {
//     public int[][] flipAndInvertImage(int[][] image) {
//         int arr[][] = new int[image.length][image.length];
//         int n;
//         for(int i = 0; i < image.length; i++) {
//             n = image.length - 1;
//             for(int j = 0; j < image.length; j++) {
//                 arr[i][j] = image[i][n];
//                 n--;
//                 if(arr[i][j] == 0) {
//                     arr[i][j] = 1;
//                 } else {
//                     arr[i][j] = 0;
//                 }
//             }
//         }
//         return arr;
//     }
// }


// class Solution {
//     public int[][] flipAndInvertImage(int[][] image) {
//         for (int i = 0; i < image.length; i++) {
//             int a = 0, r = image[0].length - 1;
//             while (a <= r) {
//                 int temp = image[i][a];
//                 image[i][a] = image[i][r];
//                 image[i][r] = temp;
//                 a++;
//                 r--;
//             }
//         }
//         for (int i = 0; i < image.length; i++) {
//             for (int j = 0; j < image[0].length; j++) {
//                 if (image[i][j] == 0) {
//                     image[i][j] = 1;
//                 } else {
//                     image[i][j] = 0;
//                 }
//             }
//         }
//         return image;
//     }
// }

class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int i=0;i<image.length;i++){
            int s=0,e=image.length-1;
            while(s<=e){
                int t=(image[i][s]+1)%2;
                image[i][s]=(image[i][e]+1)%2;
                image[i][e]=t;
                s++;
                e--;
            }
        }
        return image;
    }
}