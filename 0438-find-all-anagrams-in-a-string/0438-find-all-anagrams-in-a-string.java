// class Solution {
//   public List < Integer > findAnagrams(String s, String p) {
//     int freq1[] = new int[26];
//     int freq2[] = new int[26];
//     List < Integer > list = new ArrayList < > ();

//     if (s.length() < p.length())
//       return list;

//     for (int i = 0; i < p.length(); i++) {
//       freq1[s.charAt(i) - 'a']++;
//       freq2[p.charAt(i) - 'a']++;
//     }

//     int start = 0;
//     int end = p.length();

//     if (Arrays.equals(freq1, freq2))
//       list.add(start);

//     while (end < s.length()) {

//       freq1[s.charAt(start) - 'a']--;
//       freq1[s.charAt(end) - 'a']++;

//       if (Arrays.equals(freq1, freq2))
//         list.add(start + 1);

//       start++;
//       end++;
//     }
//     return list;
//   }
// }


class Solution {
    public List<Integer> findAnagrams(String s1, String s2) {
        int s = s1.length(), p = s2.length();
        if(s < p)
            return new ArrayList<>();
        
        List<Integer> li = new ArrayList<>();
        int[] c1 = new int[26];
        int[] c2 = new int[26];
        
        for(int i=0; i<p; i++) {
            c2[s2.charAt(i) - 'a']++;
            c1[s1.charAt(i) - 'a']++;
        }
        if(areEqual(c1, c2))
            li.add(0);
        
        for(int i=p; i<s; i++) {
            c1[s1.charAt(i-p) - 'a']--;
            c1[s1.charAt(i) - 'a']++;
            if(areEqual(c1, c2))
                li.add(i-p+1);
        }
        
        return li;
    }
    
    private boolean areEqual(int[] a, int[] b) {
        for(int i=0; i<26; i++)
            if(a[i] != b[i])
                return false;
        return true;
    }
}