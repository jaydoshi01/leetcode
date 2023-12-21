class Solution {
    // public int rob(int[] nums) {
    //     int pre = 0, cur = 0;
    //     for (int num : nums) {
    //         final int temp = Integer.max(pre + num, cur);
    //         pre = cur;
    //         cur = temp;
    //     }
    //     return cur;
    // }
   public int rob(int[] nums) {
    if (nums.length == 0) return 0;
    int[] memo = new int[nums.length + 1];
    memo[0] = 0;
    memo[1] = nums[0];
    for (int i = 1; i < nums.length; i++) {
        int val = nums[i];
        memo[i+1] = Math.max(memo[i], memo[i-1] + val);
    }
    return memo[nums.length];
}
}