class Solution {
    public int maximumWealth(int[][] accounts) {
    int maximum = 0;
    for(int i = 0 ; i < accounts.length ; i++){
        int sum = 0;
        for(int j = 0 ; j < accounts[0].length ; j++){
          sum+=accounts[i][j];
        }
       maximum = Math.max(sum, maximum);
        
    }
        return maximum;
        
    }
}