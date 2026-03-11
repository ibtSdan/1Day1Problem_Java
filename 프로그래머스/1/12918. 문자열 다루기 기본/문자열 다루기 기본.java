class Solution {
    public boolean solution(String s) {
        int n = s.length();
        if (n != 4 && n != 6) {
            return false;
        }
        for (char c : s.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }
}