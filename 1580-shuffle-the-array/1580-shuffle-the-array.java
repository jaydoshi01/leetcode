// class Solution {
//     public int[] shuffle(int[] nums, int n) {
//         int[] ans=new int[2*n];
//         int j=0;
//         for(int i=0;i<2*n;i+=2){
//             ans[i]=nums[j];
//             ans[i+1]=nums[j+n];
//             j++;
//         }
//         return ans;
//     }
// }

// class Solution {
//     public int[] shuffle(int[] nums, int n) {
        
//         int len = nums.length;
		
// 		// to store the pair of numbers in right half of the original array
//         for(int i = n; i < len; i++) {
//             nums[i] = (nums[i] * 1024) + nums[i - n];
//         }
        
//         int index = 0;
// 		// to retrive values from the pair of numbers and placing those retrieved value at their desired position
//         for(int i = n; i < len; i++, index += 2) {
//             nums[index] = nums[i] % 1024;
//             nums[index + 1] = nums[i] / 1024;
//         }
        
//         return nums;
//     }
// }
class Solution {
    public int[] shuffle(int[] nums, int n) {
        nums[0] *= -1;

        for (int i = 1; i < nums.length; i++) {
            int j = i;
            int currentNumber = nums[i];
            while (nums[j] > 0) {
                int target;
                if (j < n) {
                    target = j * 2;
                } else {
                    target = (j - n) * 2 + 1;
                }
                var temp = nums[target];
                nums[target] = currentNumber;
                currentNumber = temp;
                nums[j] *= -1;
                j = target;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Math.abs(nums[i]);
        }

        return nums;
    }
}
