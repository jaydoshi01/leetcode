class Solution {
  public int numIdenticalPairs(int[] nums) {
        int count = 0;
        int[] freq = new int[101]; //empty array
        for (int num : nums) {
            count += freq[num]; 
            freq[num]++; 
        }

        return count;
    }
}
