 // class Solution {
//     public int minEatingSpeed(int[] piles, int H) {
//         int left = 1, right = -1;
//         for (int pile : piles) {
//             right = Math.max(right, pile);
//         }
//         while (left < right) {
//             int mid = left + (right - left) / 2;
//             int time = eat(piles, mid);
//             if (time > H) {
//                 left = mid + 1;
//             } else {
//                 right = mid;
//             }
//         }
//         return left;
//     }
//     private int eat(int[] piles, int k) {
//         int result = 0;
//         for (int pile : piles) {
//             result += (int)Math.ceil((double)pile / k);
//         }
//         return result;
//     }
// }



class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = getMax(piles);
        
        while(left < right){
            int mid = left + (right - left) / 2;
            if(canEatInTime(piles, mid, h)) right = mid;
            else left = mid + 1;
        }
        return left;
    }
    
    public boolean canEatInTime(int piles[], int k, int h){
        int hours = 0;
        for(int pile : piles){
            hours += (pile + k - 1) / k; // Use ceiling division to calculate hours
        }
        return hours <= h;
    }

    public int getMax(int[] piles) {
        int max = Integer.MIN_VALUE;
        for (int pile : piles) {
            max = Math.max(max, pile);
        }
        return max;
    }
}
