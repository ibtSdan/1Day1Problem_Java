class Solution {
    public int solution(int num, int k) {
        int ans = -1;
        String s = String.valueOf(num);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) - '0' == k) {
                ans = i+1;
                break;
            }
        }
        return ans;
    }
}