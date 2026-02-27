class Solution {
    public String solution(int age) {
        String ans = "";
        String s = String.valueOf(age);
        for (char c : s.toCharArray()) {
            if (c == '0') {
                ans += "a";
            } else if (c == '1') {
                ans += "b";
            } else if (c == '2') {
                ans += "c";
            } else if (c == '3') {
                ans += "d";
            } else if (c == '4') {
                ans += "e";
            } else if (c == '5') {
                ans += "f";
            } else if (c == '6') {
                ans += "g";
            } else if (c == '7') {
                ans += "h";
            } else if (c == '8') {
                ans += "i";
            } else if (c == '9') {
                ans += "j";
            }
        }
        return ans;
    }
}