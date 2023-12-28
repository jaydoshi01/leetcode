// class Solution {
//     public int search(int[] nums, int target) {
//         int low = 0, high = nums.length - 1;

//         while (low <= high) {
//             int mid = (low + high) / 2;

//             if (nums[mid] == target) {
//                 return mid;
//             }

//             if (nums[low] <= nums[mid]) {
//                 if (nums[low] <= target && target < nums[mid]) {
//                     high = mid - 1;
//                 } else {
//                     low = mid + 1;
//                 }
//             } else {
//                 if (nums[mid] < target && target <= nums[high]) {
//                     low = mid + 1;
//                 } else {
//                     high = mid - 1;
//                 }
//             }
//         }

//         return -1;
//     }
// }


class Solution {
    public int search(int[] nums, int target) {

        int lowIndex = 0, highIndex = nums.length-1;
		
        while (lowIndex <= highIndex) {
                int midIndex =  (highIndex + lowIndex) / 2;
            
                if (nums[midIndex] == target) return midIndex;
                
                // if first half is sorted
                if (nums[lowIndex] <= nums[midIndex]) {
                    
                    // if lies in first half
                    if (target <= nums[midIndex] && target >= nums[lowIndex]) {
                        highIndex = midIndex - 1;
                    } else {
                        lowIndex = midIndex + 1;
                    }
                } else {
                    // if first half is not sorted, means second half is sorted
                    
                    // if lies in second half
                    if (target <= nums[highIndex] && target >= nums[midIndex]) {
                        lowIndex = midIndex + 1;
                    } else {
                        highIndex = midIndex - 1;
                    }
                }
        }
        
        return -1;
    }
}