class Solution {
    public int numberOfSteps(int n) {
        if(n==0||n==1){
           return n;
        }
        int count=0;
        while(n>0){
        if(n%2==0){
          n=n/2;  
        }
        else{
            n=n-1;
        }
        count++;
    }
    return count;
    }
}