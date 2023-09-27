// class Solution {
//  public static int findGCD(int[] nums) {
//         Arrays.sort(nums); 
//         int smallest = nums[0];
//         int largest = nums[nums.length - 1];
        
//         return gcd(smallest, largest);
//     }

//     public static int gcd(int a, int b) {
//         if (b == 0) {
//             return a;
//         }
//          System.gc();
//         return gcd(b, a % b);
//     }
// }

class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int GCD = 1;
        for(int i = 1; i <= nums[0]; i++) {
            if(nums[0] % i == 0 && nums[nums.length - 1] % i == 0) {
                GCD = i;
            }
        }
        return GCD;
    }
}