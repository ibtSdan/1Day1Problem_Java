class Solution {
    public int solution(int n) {
        String s = String.valueOf(n);
        int ans = 0;
        for (char c : s.toCharArray()) {
            ans += c - '0';
        }
        return ans;
    }
}