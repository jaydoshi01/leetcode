class Solution {
    public int minCostToMoveChips(int[] arr) {
       int even = 0;
       int odd = 0;
       for(int i =0;i<arr.length;i++){
           if(arr[i]%2==0)even++;
           else odd++;
       }

        if(even>odd)
        return odd;
        else 
        return even;
    }
}