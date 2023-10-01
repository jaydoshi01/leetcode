class Solution {
    public int[] twoSum(int[] nums, int target) {
         HashMap<Integer, Integer> map = new HashMap<>();
    
    // Iterate through the array
    for (int i = 0; i < nums.length; i++) {
        int complement = target - nums[i];
        
        // Check if the complement exists in the HashMap
        if (map.containsKey(complement)) {
            // Return the indices of the two numbers
            return new int[] {map.get(complement), i};
        }
        
        // Add the current element and its index to the HashMap
        map.put(nums[i], i);
    }
    
    // If no solution is found, return an empty array or throw an exception
    return new int[0];
        
    }
}