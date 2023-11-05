class Solution {
    public boolean checkIfPangram(String sentence) {
        //declare a array to maintain every char occurance
        int a[]=new int[26];
        //traverse String
        for(int i=0;i<sentence.length();i++)
        {
            int ch;
            ch=sentence.charAt(i);
            if(a[ch-97]==1)
                continue;
            else
                a[ch-97]=1;
        }
        //traverse the Array to check for every char occurance 
        for(int i=0;i<a.length;i++)
        {
            if(a[i]!=1)
                return false;
        }
        return true;
    }
}