// class Solution {
//     public boolean canJump(int[] nums) {
//        int reachable = 0;
//        for(int i = 0; i < nums.length; i ++) {
//            if(i > reachable) return false;
//            reachable = Math.max(reachable, i + nums[i]);
//        } 
//        return true;
//     }
// }

class Solution {
    public boolean canJump(int[] nums) {
        if (nums.length == 1) {
            return true;
        }
        
        int max = 0;
        
        for (int i=0; i<nums.length - 1; i++) {
            // Max value of indexes we can jump for previous index will be max-1 from current index's perspective.
            max = Math.max(nums[i], max - 1);
            
            // If we come to a situation where cannot jump any further, return false.
            if (max <= 0) {
                return false;
            }
            
            // If current max jumps that we can perform + current index is sufficient to reach to last index, return true.
            if ((max+i) >= nums.length - 1) {
                return true;
            }
        }
        
        // We never reach here, why? Because, by the time we have scanned (n-1) indices, we have either returned false because
        // we found out that we get stuck mid-way somewhere, OR, we have returned true because we had enough jumps to got last index.
        // Since its impossible to reach end of for loop by scanning entire array but still not making a decision, we never end up at this statement.
        return false;
    }
}