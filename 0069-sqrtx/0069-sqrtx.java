class Solution {
  public int mySqrt(int x) {
        if(x<0)
            return -1;
        if(x == 0)
            return 0;
        if(x<4)
            return 1;

        int low = 1;
        int high = x;

        while(low < high) {
            int mid = low + (high - low) / 2;
            
            if(x / mid == mid) {
                return mid;
            } else if (x /mid > mid) {
                low = mid + 1;
            } else {
                high = mid; // this could be the upper bound that high * high just bigger enough to > x
            }
        }
        
        return low - 1;
    }
}