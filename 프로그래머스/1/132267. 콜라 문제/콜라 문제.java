class Solution {
    public int solution(int a, int b, int n) {
        int ans = 0;
        while (n >= a) {
            ans += n/a*b;
            n = n%a + n/a*b;
        }
        return ans;
    }
}