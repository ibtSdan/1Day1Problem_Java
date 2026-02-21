class Solution {
    public int solution(int n) {
        int ans = 0;
        n = n%2==0 ? n : n-1;
        for (int i = n; i > 0; i = i-2) {
            ans += i;
        }
        return ans;
    }
}