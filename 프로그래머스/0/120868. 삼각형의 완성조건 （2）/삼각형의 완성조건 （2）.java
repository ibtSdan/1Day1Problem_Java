class Solution {
    public int solution(int[] sides) {
        int ans = 0;
        int max = Math.max(sides[0], sides[1]);
        int min = Math.min(sides[0], sides[1]);
        ans += min - 1;
        for (int i = 1; i <= max; i++) {
            if (min + i > max) {
                ans++;
            }
        }
        return ans;
    }
}