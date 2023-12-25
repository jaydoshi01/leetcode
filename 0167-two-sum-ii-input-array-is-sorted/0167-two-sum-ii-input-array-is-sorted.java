// class Solution {
//      public int[] twoSum(int[] numbers, int target) {
//         for (int i = 0; i < numbers.length; ++i) {
//             int low = i + 1;
//             int high = numbers.length - 1;
//             while (low <= high) {
//                 int mid = (high - low) / 2 + low;
//                 if (numbers[mid] == target - numbers[i]) {
//                     return new int[]{i + 1, mid + 1};
//                 } else if (numbers[mid] > target - numbers[i]) {
//                     high = mid - 1;
//                 } else {
//                     low = mid + 1;
//                 }
//             }
//         }
//         return new int[]{-1, -1};
//     }
// }

class Solution {
    public int[] twoSum(int[] num, int target) {
         int[] indice = new int[2];
    if (num == null || num.length < 2) return indice;
    int left = 0, right = num.length - 1;
    while (left < right) {
        int v = num[left] + num[right];
        if (v == target) {
            indice[0] = left + 1;
            indice[1] = right + 1;
            break;
        } else if (v > target) {
            right --;
        } else {
            left ++;
        }
    }
    return indice;
        
    }
}
    
    
    // public int[] twoSum(int[] numbers, int target) {
    //     int start = 0, end = numbers.length - 1;
    //     while(start < end){
    //         if(numbers[start] + numbers[end] == target) break;
    //         if(numbers[start] + numbers[end] < target) start++;
    //         else end--;
    //     }
    //     return new int[]{start + 1, end + 1};
    // }
    
    
    
//     public int[] twoSum(int[] numbers, int target) {
//         if(numbers.length == 2){
//             return new int[]{1, 2};
//         }
//         int start = 0;
//         int end = numbers.length - 1;
//         while(start < end){
//             if(numbers[start] + numbers[end] == target){
//                 return new int[]{start + 1, end + 1};
//             }
//             else if(numbers[start] + numbers[end] > target){
//                 end -= 1;
//             }
//             else{
//                 start += 1;
//             }
//         }
//         return new int[]{-1, -1};
//     }

