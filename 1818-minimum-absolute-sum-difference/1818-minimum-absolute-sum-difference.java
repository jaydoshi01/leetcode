// class Solution {
//     public int minAbsoluteSumDiff(int[] nums1, int[] nums2) {
        
//         int sum=0;
//         int mod=1000000007;
//         // diff of nums1[i]-nums2[i]  0<= i <nums1.length 
//         int diffArr[] = new int[nums1.length];
        
//         for(int i=0; i<nums1.length; i++){
//             int dif = Math.abs(nums1[i] - nums2[i]);
//             diffArr[i] = dif;
//             sum= (sum + dif)%mod;
//         }
        
//         if(sum == 0) return 0;
        
//         //sort nums1 array
//         int sortedNums1[] = Arrays.copyOf(nums1, nums1.length);
//         Arrays.sort(sortedNums1);
        
//         // final result - minSum
//         int minSum = sum;
        
//         for(int i=0; i<diffArr.length; i++){
            
//             //binary serch on sorted nums1 array
//             int left=0, right=sortedNums1.length-1;
//             while(left<=right){
//                 int mid = left+(right-left)/2;
//                 int diff = Math.abs(sortedNums1[mid]-nums2[i]);
//                 int newSum = ((sum-diffArr[i])+diff)%mod;
//                 if(minSum > newSum){            
//                     minSum= newSum;
//                 }
                
//                 if(nums2[i] < sortedNums1[mid]){
//                     right = mid-1;
//                 }else{
//                     left = mid+1;
//                 }
//             }
//         }
        
//         return minSum%mod;
       
        
//     }
// }


class Solution {

public int minAbsoluteSumDiff(int[] nums1, int[] nums2) {
    int len = nums1.length;
    int mod = 1_000_000_007,val = 0;
    long sum = 0,ans = 0;
    
    //To store actual difference
    int[] diff = new int[len];
    
    //To calculate actual sum and differences of each elemts of two arrays
    for(int i = 0 ; i < len ;i++){
        diff[i] = Math.abs(nums1[i] - nums2[i]);
        sum += diff[i];
    }
    //Backup for sum
    ans = sum;
    
    //sorting array to use binary search to find ceiling and floor elent of target element
    Arrays.sort(nums1);
    
    // to find minimum abs diff
    for(int i =0 ; i < len ; i++){
       sum -= diff[i];
        val = MinimumDiff(nums1,nums2[i]);
        sum += val;
        if(sum < ans)
            ans = sum;
        sum -= val;
        sum += diff[i];
    }
    return (int)(ans % mod);
    
}

//Binary search to find ceil and floor of each element of nums2 array
public int MinimumDiff(int[] nums,int target) {
    int s = 0,e = nums.length - 1,ans = Integer.MAX_VALUE,small = -1,big = -1;
    while(s <= e){
        int m = s + (e - s) / 2;
        if(nums[m] == target)
            return 0;
        else if(target > nums[m]){
            s = m + 1;
            small = m;
        }
        else{
            e = m - 1;
            big = m;
        }
    }
    
    // finding minimum diff by subtracting ceil and floor from target element
    if(small != -1)
        ans = Math.abs(target - nums[small]);
    if(big != -1)
        ans = Math.min(ans,Math.abs(target - nums[big]));
    return ans;
    
}
}