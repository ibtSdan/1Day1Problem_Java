class Solution {
    public int solution(int[] array, int n) {
        int ans = 0;
        for (int i : array) {
            if (i == n) {
                ans++;
            }
        }
        return ans;
    }
}