class Solution {
    public boolean check(int[] nums) {
        int cnt = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] > nums[(i+1) % nums.length])
            cnt += 1;
        }
        return cnt > 1? false : true;
    }
}