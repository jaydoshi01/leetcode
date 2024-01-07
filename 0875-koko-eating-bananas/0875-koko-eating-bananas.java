class Solution {
    public int minEatingSpeed(int[] piles, int H) {
        int left = 1, right = -1;
        for (int pile : piles) {
            right = Math.max(right, pile);
        }
        while (left < right) {
            int mid = left + (right - left) / 2;
            int time = eat(piles, mid);
            if (time > H) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }
    private int eat(int[] piles, int k) {
        int result = 0;
        for (int pile : piles) {
            result += (int)Math.ceil((double)pile / k);
        }
        return result;
    }
}