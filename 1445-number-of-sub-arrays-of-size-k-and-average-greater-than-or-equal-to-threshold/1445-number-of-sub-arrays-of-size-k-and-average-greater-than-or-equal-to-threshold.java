class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int windowSum=0,ans=0;
        for(int i=0;i<k;i++) {
            windowSum+=arr[i];
        }
        if(windowSum>=threshold*k) 
        ans++;
       
        for(int i=k;i<arr.length;i++) {
            windowSum+=arr[i];
            windowSum-=arr[i-k];

            if(windowSum>=threshold*k) 
            ans++;
        }
        return ans;


    }
}