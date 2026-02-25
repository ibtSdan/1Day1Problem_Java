class Solution {
    public int solution(String num_str) {
        int ans = 0;
        for (char c : num_str.toCharArray()) {
            ans += c - '0';
        }
        return ans;
    }
}