class Solution {
	public int pivotInteger(int n) {
		// Your code goes here
	   
	   int ans = n*(n+1)/2;
           for(int i =1 ; i <=n ; i++){
		   if(i*i == ans){
			   return i;
		   }
	   }
	 return -1;
	}
	
}