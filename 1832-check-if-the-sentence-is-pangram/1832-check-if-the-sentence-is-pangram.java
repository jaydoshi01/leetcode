class Solution {
public boolean checkIfPangram(String sentence) {
    int cnt[] = new int[26], total = 0;
    for (var ch: sentence.toCharArray())
        if (++cnt[ch - 'a'] == 1)
            total++;
    return total == 26;
}
}