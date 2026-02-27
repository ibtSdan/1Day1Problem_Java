class Solution {
    public String solution(int[] numLog) {
        String ans = "";
        for (int i = 1; i < numLog.length; i++) {
            int prev = numLog[i-1];
            int now = numLog[i];
            if (now - prev == 1) {
                ans += "w";
            } else if (now - prev == -1) {
                ans += "s";
            } else if (now - prev == 10) {
                ans += "d";
            } else {
                ans += "a";
            }
        }
        return ans;
    }
}