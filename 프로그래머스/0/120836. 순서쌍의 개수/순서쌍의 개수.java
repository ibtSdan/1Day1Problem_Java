class Solution {
    public int solution(int n) {
        int ans = 0;
        for (int i = 1; i < Math.sqrt(n); i++) {
            if (n%i == 0) {
                ans++;
            }
        }
        if ((int) Math.sqrt(n) == Math.sqrt(n)) {
            return ans*2 + 1;
        }
        return ans*2;
    }
}