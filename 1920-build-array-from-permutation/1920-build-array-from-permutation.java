class Solution {
    public int[] buildArray(int[] nums) {
        // declare result array of nums length
        int[] result = new int[nums.length];
        // iterate over nums array:
        for(int i = 0; i < nums.length; i++) {
            // put each permutation in result array
            result[i] = nums[nums[i]];
        }
        // return result array
        return result;
    }
}