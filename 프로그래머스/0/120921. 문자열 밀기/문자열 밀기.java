class Solution {
    public int solution(String A, String B) {
        int ans = 0;
        if (A.equals(B)) {
            return 0;
        }
        int n = A.length();
        for (int i = 0; i < n-1; i++) {
            ans++;
            A = A.substring(n-1, n) + A.substring(0, n-1);
            if (A.equals(B)) {
                return ans;
            }
        }
        return -1;
    }
}