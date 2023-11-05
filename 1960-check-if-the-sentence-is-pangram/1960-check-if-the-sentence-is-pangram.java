class Solution {
    public boolean checkIfPangram(String sentence) {
    //     //declare a array to maintain every char occurance
    //     int a[]=new int[26];
    //     //traverse String
    //     for(int i=0;i<sentence.length();i++)
    //     {
    //         int ch;
    //         ch=sentence.charAt(i);
    //         if(a[ch-97]==1)
    //             continue;
    //         else
    //             a[ch-97]=1;
    //     }
    //     //traverse the Array to check for every char occurance 
    //     for(int i=0;i<a.length;i++)
    //     {
    //         if(a[i]!=1)
    //             return false;
    //     }
    //     return true;
    // }


        int[] arr = new int[26];
        int count = 0;
    
    for (int i = 0; i < sentence.length(); i++) {
        if (arr[sentence.charAt(i) - 'a'] == 0) {
            arr[sentence.charAt(i) - 'a'] += 1;
            count++;
        }
        if (count == 26) {
            return true;
        }
    }
    return false;
}
}