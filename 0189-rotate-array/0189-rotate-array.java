class Solution {

    public static void reverse(int nums[], int start, int end){
    // While start index is less than end index
    while(start < end){
        // Swap elements at start and end indices
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
        // Increment start index and decrement end index
        start++;
        end--;
    }
}

    public void rotate(int[] nums, int k) {
        // Ensure k is within array bounds
        k %= nums.length;
        // Reverse entire array
        reverse(nums, 0, nums.length - 1);
        // Reverse first k elements
        reverse(nums, 0, k - 1);
        // Reverse remaining elements
        reverse(nums, k, nums.length - 1);
    }
}


// class Solution {
//     public void rotate(int[] nums, int k) {
//         k %= nums.length;
//         int n = nums.length;
//         reverseNum(nums,0,n-1);
//         reverseNum(nums,0,k-1);
//         reverseNum(nums,k,n-1);
//     }
//     public void reverseNum(int[] nums, int start, int end) {
//         while(start < end) {
//             int temp = nums[start];
//             nums[start] = nums[end];
//             nums[end] = temp;
//             start++;
//             end--;
//         }
//     }
// }