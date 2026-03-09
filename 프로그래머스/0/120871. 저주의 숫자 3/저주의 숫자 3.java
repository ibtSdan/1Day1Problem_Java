class Solution {
    public int solution(int n) {
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            ans++;
            while (check(ans) || ans%3 == 0) {
                ans++;
            }
        }
        return ans;
    }
    
    public boolean check(int v) {
        String s = String.valueOf(v);
        for (char c : s.toCharArray()) {
            if (c == '3') {
                return true;
            }
        }
        return false;
    }
}