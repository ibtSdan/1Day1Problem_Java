class Solution {
    boolean solution(String s) {
        int cnt_p = 0, cnt_y = 0;
        s = s.toLowerCase();
        for (char c : s.toCharArray()) {
            if (c == 'p') {
                cnt_p++;
            } else if (c == 'y') {
                cnt_y++;
            }
        }
        if (cnt_p == cnt_y) {
            return true;
        }
        return false;
    }
}