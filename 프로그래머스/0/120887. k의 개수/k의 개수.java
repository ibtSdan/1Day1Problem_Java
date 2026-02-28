class Solution {
    public int solution(int i, int j, int k) {
        int ans = 0;
        for (int n = i; n <= j; n++) {
            ans += find(n, k);
        }
        return ans;
    }
    
    static int find(int n, int k) {
        int cnt = 0;
        for (char c : String.valueOf(n).toCharArray()) {
            if (c-'0' == k) {
                cnt++;
            }
        }
        return cnt;
    }
}