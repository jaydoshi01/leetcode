class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
     List<Integer> arr = new ArrayList<>();
        
       for(int i = 0 ; i < matrix.length ; i++ ){
           int minidx=0;
           int min=999999999;
           for(int j = 0 ; j < matrix[i].length ; j++){
               if(matrix[i][j]  <  min) {
                   min = matrix[i][j];
                   minidx = j;
               }
           }
           boolean isTrue = true;
           for(int j = 0 ; j < matrix.length ; j++ ){
               if(matrix[i][minidx] < matrix[j][minidx]){
                   isTrue = false;
                   break;
               }
           }
           if(isTrue){
              arr.add(matrix[i][minidx]);
           }
       } 
        return arr;
    }
}