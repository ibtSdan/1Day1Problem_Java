class Solution {
    public int solution(int order) {
        int ans = 0;
        String s = String.valueOf(order);
        for (char c : s.toCharArray()) {
            if (c-'0' == 3 || c-'0' == 6 || c-'0'== 9) {
                ans++;
            }
        }
        return ans;
    }
}