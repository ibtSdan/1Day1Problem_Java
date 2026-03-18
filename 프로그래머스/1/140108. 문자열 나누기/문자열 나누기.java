class Solution {
    public int solution(String s) {
        int ans = 0;
        int idx = 0;
        char x = '0';
        int x_cnt = 0, y_cnt = 0;
        while (s.length() > 0 && idx < s.length()) {
            if (idx == 0) {
                x = s.charAt(0);
                x_cnt++;
                idx++;
            } else {
                if (x == s.charAt(idx)) {
                    x_cnt++;
                } else {
                    y_cnt++;
                }
                idx++;
            }
            if (x_cnt == y_cnt) {
                ans++;
                s = s.substring(idx, s.length());
                idx = 0;
                x_cnt = 0;
                y_cnt = 0;
            }
        }
        return idx == 0 ? ans : ans+1;
    }
}