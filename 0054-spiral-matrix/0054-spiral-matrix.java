class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
      if(matrix.length==0) {
            return Collections.EMPTY_LIST;
        }
        List<Integer> cells = new ArrayList<>();
       int top = 0;
       int bottom =matrix.length-1;
        int left = 0;
        int right = matrix[0].length-1;
		//loop while still in the matrix boundries 
        while(top <= bottom && left <= right){

           //move right
            for(int i = left; i<= right; i++){
                cells.add(matrix[top][i]);
            }
            
            //Set the top row pointer down to the next row
            top++;
            //
            //Move down
            for(int i = top; i<= bottom; i++){
                cells.add(matrix[i][right]);
            }
            //Move column pointer to left
            right--;
           
            //Move left
            if(top <= bottom){
                for(int i = right; i>= left; i--){
                    cells.add(matrix[bottom][i]);
                }
            }
            //Set bottom row pointer to next row up
            bottom--;
            //move up
            if(left <= right){
                for(int i = bottom; i>= top; i--){
                    cells.add(matrix[i][left]);
                }
            }
            //set left coulmn pointer to next column to the right
            left++;
        }

        return cells;
    }
    
}