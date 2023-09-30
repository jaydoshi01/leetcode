class Solution {
    public int numberOfMatches(int n) {
        int matches = 0;
        int teams = n;

        while (teams > 1) {
            matches += teams / 2;
            teams = (teams + 1) / 2;
        }

        return matches;
    }
}
