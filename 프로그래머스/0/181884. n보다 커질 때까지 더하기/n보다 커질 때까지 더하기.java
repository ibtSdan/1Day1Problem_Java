class Solution {
    public int solution(int[] numbers, int n) {
        int ans = 0;
        for (int i : numbers) {
            ans += i;
            if (ans > n) {
                return ans;
            }
        }
        return ans;
    }
}