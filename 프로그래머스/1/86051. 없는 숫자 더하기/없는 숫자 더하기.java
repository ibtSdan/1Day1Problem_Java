class Solution {
    public int solution(int[] numbers) {
        int ans = 45;
        for (int i : numbers) {
            ans -= i;
        }
        return ans;
    }
}