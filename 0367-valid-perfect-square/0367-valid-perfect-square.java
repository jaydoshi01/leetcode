// class Solution {
//     public boolean isPerfectSquare(int num) {
//         int low = 1, high = num;
//         while (low <= high) {
//             long mid = (low + high) >>> 1;
//             if (mid * mid == num) {
//                 return true;
//             } else if (mid * mid < num) {
//                 low = (int) mid + 1;
//             } else {
//                 high = (int) mid - 1;
//             }
//         }
//         return false;
//     }
// }

class Solution {
    public boolean isPerfectSquare(int num) {
        double a = Math.sqrt(num);
        if(Math.ceil(a)==Math.floor(a)){
            return true;
        }
        return false;
    }
}