class Solution {
    public int subtractProductAndSum(int n) {
       ArrayList<Integer> list=new ArrayList<>();
       int n1=n;
       while(n!=0){
           int a=n%10;
           list.add(a);
           n=n/10;
       }
       int pro=1;
       for(int i=0;i<list.size();i++){
           pro*=list.get(i);
       }
       int sum=0;
       for(int i=0;i<list.size();i++){
           sum+=list.get(i);
       }
return pro-sum;
    }
}