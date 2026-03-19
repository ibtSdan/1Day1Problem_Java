class Solution {
    public int solution(String dartResult) {
        int[] ans = new int[3];
        int idx = -1;
        for (int i = 0; i < dartResult.length(); i++) {
            char c = dartResult.charAt(i);
            if (Character.isDigit(c)) {
                idx++;
                if (c == '1' && i+1 < dartResult.length() && dartResult.charAt(i+1) == '0') {
                    ans[idx] = 10;
                    i++;
                } else {
                    ans[idx] = c - '0';
                }
            } else if (c == 'D') {
                ans[idx] = (int)Math.pow(ans[idx], 2);
            } else if (c == 'T') {
                ans[idx] = (int)Math.pow(ans[idx], 3);
            } else if (c == '*') {
                ans[idx] *= 2;
                if (idx-1 >= 0) {
                    ans[idx-1] *= 2;
                }
            } else if (c == '#') {
                ans[idx] *= -1;
            }
        }
        return ans[0] + ans[1] + ans[2];
    }
}