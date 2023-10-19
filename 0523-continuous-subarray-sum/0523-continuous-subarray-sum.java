// class Solution 
// {
//     public boolean checkSubarraySum(int[] nums, int k) 
//     {
//         if (k == 0) return two_zeros(nums);
//         for (int i = 0; i < nums.length; ++i)
//         {
//             int sum = nums[i];
//             for (int j = i + 1; j < nums.length; ++j)
//             {
//                 sum += nums[j];
//                 if (sum % k == 0) return true;
//             }
//         }
        
//         return false;
//     }
    
//     boolean two_zeros(int[] a)
//     {
//         for (int i = 0; i < a.length - 1; ++i)
//         {
//             if (a[i] == 0 && a[i + 1] == 0) return true;
//         }
        
//         return false;
//     }
// }


class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> hm  = new HashMap<>();
        hm.put(0,0);
        
        int sum = 0;
        // hm.put(0,-1);
        for( int  i = 0;i < nums.length; i++){
            int num = nums[i];
            sum+=num;
      
            if(hm.containsKey(sum%k)){
                if(hm.get(sum%k)  < i )
                    return true;
            }else
                hm.put(sum%k, i+1);
            
        }
        return false;
    }
}