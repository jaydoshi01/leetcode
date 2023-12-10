// class Solution {
//     public int maximumPopulation(int[][] logs) {
//      int[] map = new int[101]; // Based on problem statement: 1950 <= birthi < deathi <= 2050, so we only need 101.
//         for(int[] l : logs){
//             for(int i = l[0]; i < l[1]; i++){
//                 map[i - 1950]++;
//             }
//         }
//         int max = 0;
//         int res = -1;
//         for(int i = 0; i < 101; i++){
//             if(map[i] > max){
//                 max = map[i];
//                 res = i + 1950;
//             }
//         }
//         return res; 
// }
// }

class Solution {
    public int maximumPopulation(int[][] logs) {
        
        int[] year = new int[2051];
        
        for(int[] log : logs){
            
            year[log[0]] += 1;
            year[log[1]] -= 1;
        }
        
        int maxNum = year[1950], maxYear = 1950;
        
        for(int i = 1951; i < year.length; i++){
            year[i] += year[i - 1];  
            
            if(year[i] > maxNum){
                maxNum = year[i];
                maxYear = i;
            }
        }
        
        return maxYear;
    }
}
