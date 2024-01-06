// class Solution {
//     boolean isPossible(int n, int index, int maxSum, int value){
//         int leftValue = Math.max(value - index, 0);
//         int rightValue = Math.max(value - ((n-1)-index), 0);
        
//         long sumBefore = (long) (value + leftValue) * (value - leftValue + 1) / 2;
//         long sumAfter = (long) (value + rightValue) * (value - rightValue + 1) / 2;
        
//         return sumBefore + sumAfter - value <= maxSum;
//     }
    
//     public int maxValue(int n, int index, int maxSum) {
//         int left = 0, right = maxSum - n;
        
//         while(left < right){
//             int middle = (left + right + 1) / 2;
//             if(isPossible(n, index, maxSum - n, middle))
//                 left = middle;
//             else
//                 right = middle - 1;
//         }
//         return left + 1;
//     }
// }


// class Solution {
//     public int maxValue(int n, int index, int maxSum) {
//        int l = index; // Number of elements in left part
//         int r = n-index-1; // Number of elements in right part
        
//         // range for nums[index]
//         long lo = 1;   
//         long high = maxSum;
        
//         long sum =0;
        
//         // final answer is stored in res
//         long res =0;
        
        
//         while(lo <= high)
//         {
//             long mid = lo + (high-lo)/2;
//             long ls =0; // Left Part sum
//             long rs = 0; // Right Part Sum
//             sum = mid;
            
//             long m = mid-1;  // used in finding left sum and right sum
            
//             if(r > 0)
//             {
//                 if(r<=m)   
//                 {   /*
//                     When right part is filled with decreasing order natural numbers
//                     then use this formula
//                     */
//                     rs = m*(m+1)/2 - (m-r)*(m-r+1)/2;
//                 }else
//                     /*
//                     When right part is filled with 1's then use this formula
//                     */
//                     rs = m*(m+1)/2 + 1*(r-m);
//             }
//             if(l>0)
//             {
//             if(l<=m)
                
//                 /*
//                 9+8+7+6 = (1+2+3+4+5+.......+8+9) - (1+2+3+4+5)
//                 */
//                 ls = m*(m+1)/2 - (m-l)*(m-l+1)/2;
//             else
                     
//                 ls = m*(m+1)/2 + 1*(l-m);
//             }
//             // sum = left part + mid element + right part
//             sum = sum +ls +rs;
            
//             if(sum <= maxSum)
//             {   res = Math.max(res,mid);  // Storing the maximum nums[index] 
//                 //System.out.print(res);
//                 lo = mid+1;
//             }else{
//                 high = mid-1;
//             }
            
            
//         }
        
//         return (int)res;
        
//     }   
//     }


class Solution {
    long calcSum(long n) { return (n * (n + 1)) / 2; }
    long getSum(int index, int val, int len)
    {
        int expectedLen = val - 1;
        int actualLen = len;
        long sum = 0;
        if (expectedLen > actualLen) sum = calcSum(expectedLen) - calcSum(val - actualLen - 1);
        else
        {
            int extraLen = actualLen - expectedLen;
            long extraSum = extraLen * 1;
            sum = calcSum(expectedLen) + extraSum;
        }
        return sum;
    }
    long getSumOfArray(int n, int index, int val)
    {
        //1, 1, 1, (val - 2), (val - 1), val, (val - 1), (val - 2), 1, 1, 1
        long leftSum = getSum(index, val, index);
        long rightSum = getSum(index, val, n - index - 1);
        return (val + leftSum + rightSum);
    }
    public int maxValue(int n, int index, int maxSum) 
    {
        int low = 1, high = maxSum;
        int ans = -1;
        while(low <= high)
        {
            int mid = low + (high - low) / 2; 
            long sum =  getSumOfArray(n, index, mid);
            if (sum <= maxSum) { ans = mid; low = mid + 1; }
            else high = mid - 1;
        }
        return ans;
    }
}