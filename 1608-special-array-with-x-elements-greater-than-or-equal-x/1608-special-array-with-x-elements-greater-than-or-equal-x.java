// class Solution {
//     public int specialArray(int[] nums) {
//         for(int i = 1 ; i < 1001 ; i++){
//             int count = 0;
//             for(int num : nums){
//                 if(num >= i)
//                     count++;     
//             }
//                  if(i==count)
//                     return i;
//                 }  
//                    return -1;     
//     }
// }


class Solution {
    public int specialArray(int[] nums) {
        int[] bucket = new int[1001];
        for(int num : nums){
            bucket[num]++;
        }
            int total = nums.length;
        for(int i = 0 ; i < 1001 ; i++){
            if(i==total){
                return i;
            }else{
                total -= bucket[i];
            }
        }
        return -1;
    }
}




