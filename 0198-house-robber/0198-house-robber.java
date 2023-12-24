class Solution {
    public int rob(int[] nums) {
        int pre = 0, cur = 0;
        for (int num : nums) {
            final int temp = Integer.max(pre + num, cur);
            pre = cur;
            cur = temp;
        }
        return cur;
    }
}
    
    
    
    
//    public int rob(int[] nums) {
//     if (nums.length < 2) return nums[0];
//     int[] memo = new int[nums.length];
//     memo[0] = nums[0];
//     memo[1] = Math.max(nums[0] , nums[1]);
//     for (int i = 2; i < nums.length; i++) {
        
//         memo[i] = Math.max(memo[i-2]+nums[i], memo[i-1]);
//     }
//     return memo[nums.length-1];
// }
// }