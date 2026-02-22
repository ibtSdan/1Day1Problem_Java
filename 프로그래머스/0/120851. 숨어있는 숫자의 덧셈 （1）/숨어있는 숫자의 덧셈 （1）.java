class Solution {
    public int solution(String my_string) {
        int ans = 0;
        for (char c : my_string.toCharArray()) {
            if (Character.isDigit(c)) {
                ans += c - '0';
            }
        }
        return ans;
    }
}