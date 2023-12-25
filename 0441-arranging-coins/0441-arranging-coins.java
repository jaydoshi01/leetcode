class Solution {
    public int arrangeCoins(int n) {
         long start = 0;
         long end = n ;
        while (start <= end) {
            long mid = start + (end - start) / 2;
            long coinsFilled = mid * (mid + 1) / 2;
            if (coinsFilled == n) {
                return (int) mid;
            }
            if (coinsFilled < n) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        // Since at this point start > end, start will start pointing to a value greater
        // than the desired result. We will return end as it will point to the correct
        // int value.
        return (int) end;
    }
}
    
