class Solution {
    public String solution(String s, int n) {
        String ans = "";
        for (char c : s.toCharArray()) {
            if (c == ' ') {
                ans += " ";
            } else if (Character.isUpperCase(c)) {
                int temp = c + n;
                if (temp >= 91) {
                    temp -= 26;
                }
                ans += (char) temp;
            } else {
                int temp = c + n;
                if (temp >= 123) {
                    temp -= 26;
                }
                ans += (char) temp;
            }
        }
        return ans;
    }
}