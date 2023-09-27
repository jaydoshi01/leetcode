class Solution {
 public static int findGCD(int[] nums) {
        Arrays.sort(nums); 
        int smallest = nums[0];
        int largest = nums[nums.length - 1];
        
        return gcd(smallest, largest);
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
         System.gc();
        return gcd(b, a % b);
    }
}