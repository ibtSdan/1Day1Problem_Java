class Solution {
    public int solution(String number) {
        int ans = 0;
        for (char c : number.toCharArray()) {
            ans += c - '0';
        }
        return ans%9;
    }
}