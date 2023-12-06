// class Solution {
// public boolean checkIfPangram(String sentence) {
//     int cnt[] = new int[26], total = 0;
//     for (int ch: sentence.toCharArray())
//         if (++cnt[ch - 'a'] == 1)
//             total++;
//     return total == 26;
// }
// }
    

class Solution {
    public boolean checkIfPangram(String sentence) {
        int[] letters = new int[26];
        for(int i = 0 ;i< 26;i++){
            letters[i] = -1;
        }
        for(int i = 0;i<sentence.length();i++){
            char ch = sentence.charAt(i);
            // System.out.println(ch);
            letters[ch - 'a']++;
        }
        for(int i : letters){
            if(i == -1)return false;
        }
        return true;
    }
}
   