// class Solution {
//     public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        
//         //using two pinter approach.
//         int aliceTotal = 0;
//         int bobTotal = 0;
//         //Find sum of alice candies before exchange.
//         for(int aa : aliceSizes)
//             aliceTotal += aa;
//         //Find sum of bob candies before exchange.
//         for(int bb : bobSizes)
//             bobTotal += bb;
        
//         for(int i = 0; i< aliceSizes.length; i++){
//             for(int j = 0; j< bobSizes.length; j++){
//                 int aliceExchange = aliceTotal - aliceSizes[i] + bobSizes[j];
//                 int bobExchange = bobTotal - bobSizes[j] + aliceSizes[i];
//                 if(aliceExchange == bobExchange){
//                     return new int[]{aliceSizes[i], bobSizes[j]};
//                 }
//             }
//         }
//         return new int[0];
//     }
// }

// class Solution {
//   public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
//     int aliceTotal = 0;
//     int bobTotal = 0;
//     for (int candies : aliceSizes)
//       aliceTotal += candies;
//     for (int candies : bobSizes)
//       bobTotal += candies;
    
//     Arrays.sort(bobSizes);
    
//     int m = aliceSizes.length, n = bobSizes.length;
//     for (int i = 0; i < m; i++) {      
//       int target = (bobTotal + 2 * aliceSizes[i] - aliceTotal) / 2;
//       if (binarySearch(bobSizes, target))
//         return new int[] { aliceSizes[i], target };
//     }

//     return new int[0];
//   }

//   private boolean binarySearch(int[] arr, int target) {
//     int l = 0, r = arr.length - 1;
//     while (l <= r) {
//       int m = l + (r - l) / 2;
//       if (target < arr[m])
//         r = m - 1;
//       else if (target > arr[m])
//         l = m + 1;
//       else
//         return true;
//     }
//     return false;
//   }
// }


class Solution {
  public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
    int aliceTotal = 0;
    int bobTotal = 0;
    for (int candies : aliceSizes) aliceTotal += candies;
    for (int candies : bobSizes) bobTotal += candies;
        
    Set<Integer> targets = new HashSet<>();
    for (int i = 0, m = aliceSizes.length; i < m; i++)
      targets.add((bobTotal - aliceTotal + 2 * aliceSizes[i]) / 2);

    for (int j = 0, n = bobSizes.length; j < n; j++)
      if (targets.contains(bobSizes[j]))
        return new int[] { (aliceTotal + 2 * bobSizes[j] - bobTotal) / 2, bobSizes[j] };

    return new int[0];
  }
}