class Solution {
    public String solution(String s) {
        int n = s.length();
        if (n%2==0) {
            return s.substring(n/2-1, n/2+1);
        } else {
            return s.substring(n/2, n/2+1);
        }
    }
}