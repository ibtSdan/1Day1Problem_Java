class Solution {
    public String solution(String myString) {
        String ans = "";
        for (char c : myString.toCharArray()) {
            if (Character.isLowerCase(c)) {
                ans += Character.toUpperCase(c);
            } else {
                ans += c;
            }
        }
        return ans;
    }
}