class Solution {
    public String solution(String rsp) {
        String ans = "";
        for (char c : rsp.toCharArray()) {
            if (c == '2') {
                ans += "0";
            } else if (c == '0') {
                ans += "5";
            } else {
                ans += "2";
            }
        }
        return ans;
    }
}