class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        int total = 0;
        for(int i : nums){
            count = 0;
            while(true){
                if(i<=0)
                    break;
                i/=10;
                count++;
            }
            count = count%2 == 0 ? 1: 0;
            total += count;
        }
        return total;
    }
}