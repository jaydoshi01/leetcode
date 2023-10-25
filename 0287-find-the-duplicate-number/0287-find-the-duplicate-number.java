class Solution {
    public int findDuplicate(int[] nums) {
        boolean[] s = new boolean[nums.length];
        for(int i: nums) {
            if(s[i]) return i;
            s[i] = true;
        }
        return 0;
    }
}