// class Solution {
//     public List<List<Integer>> threeSum(int[] nums) {
//         int target = 0;
//         Arrays.sort(nums);
//         Set<List<Integer>> s = new HashSet<>();
//         List<List<Integer>> output = new ArrayList<>();
//         for (int i = 0; i < nums.length; i++){
//             int j = i + 1;
//             int k = nums.length - 1;
//             while (j < k) {
//                 int sum = nums[i] + nums[j] + nums[k];
//                 if (sum == target) {
//                     s.add(Arrays.asList(nums[i], nums[j], nums[k]));
//                     j++;
//                     k--;
//                 } else if (sum < target) {
//                     j++;
//                 } else {
//                     k--;
//                 }
//             }
//         }
//         output.addAll(s);
//         return output;
//     }
// }

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
         List<List<Integer>> result = new ArrayList<>();
        
        // Sort the array in ascending order
        Arrays.sort(nums);
        
        for (int i = 0; i < nums.length - 2; i++) {
            // Skip duplicate elements for the first element of the triplet
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            
            int left = i + 1;
            int right = nums.length - 1;
            
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                
                if (sum == 0) {
                    // Found a valid triplet
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    
                    // Skip duplicate elements for the second and third elements of the triplet
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }
                    
                    // Move both pointers inward
                    left++;
                    right--;
                } else if (sum < 0) {
                    // Sum is too small, move left pointer to the right
                    left++;
                } else {
                    // Sum is too large, move right pointer to the left
                    right--;
                }
            }
        }
        
        return result;
    }    
}