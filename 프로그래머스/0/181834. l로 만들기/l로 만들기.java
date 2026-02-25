class Solution {
    public String solution(String myString) {
        String ans = "";
        for (char c : myString.toCharArray()) {
            if (c < 'l') {
                ans += 'l';
            } else {
                ans += c;
            }
        }
        return ans;
    }
}