// class Solution {
//     public int reachNumber(int target) {
        
//        target = Math.abs(target);
//         int step = 0 ; 
//         int sum = 0 ; 
//         while( sum < target){
//             step++;
//             sum+=step;
//         }
//         while((sum - target) % 2 != 0){
//             step++;
//             sum+=step;    
//         }
//          return step;
//     }
   
// }

class Solution {
    public int reachNumber(int target) {
        target = Math.abs(target);
        int k = 0;
        while (target > 0)
            target -= ++k;
        return target % 2 == 0 ? k : k + 1 + k%2;
    }
}