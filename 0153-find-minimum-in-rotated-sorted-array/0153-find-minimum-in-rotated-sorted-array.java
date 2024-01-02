class Solution {
        public int findMin(int[] num) {
            int left = 0, right = num.length - 1;
            while(left < right){
                int mid = (left + right) / 2;
                if(num[left] > num[right]){
                    if(num[left] <= num[mid]){
                        left = mid + 1;
                    }else{
                        right = mid;
                    }
                }else{
                    return num[left];
                }
            }
            return num[left];
        }
    }