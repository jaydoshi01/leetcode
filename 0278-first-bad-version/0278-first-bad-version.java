/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

// public class Solution extends VersionControl {
//     public int firstBadVersion(int n) {
//     int start = 1, end = n;
//     while (start < end) {
//         int mid = start + (end-start) / 2;
//         if (!isBadVersion(mid)) start = mid + 1;
//         else end = mid;            
//     }        
//     return start;
// }
// }


public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int left = 1, right = n, ans = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2; // to avoid overflow incase (left+right)>2147483647
            if (isBadVersion(mid)) {
                ans = mid; // record mid as current answer
                right = mid - 1; // try to find smaller version in the left side
            } else {
                left = mid + 1; // try to find in the right side
            }
        }
        return ans;
    }
}