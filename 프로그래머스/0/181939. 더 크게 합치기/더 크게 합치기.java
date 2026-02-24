class Solution {
    public int solution(int a, int b) {
        String s1 = String.valueOf(a) + String.valueOf(b);
        String s2 = String.valueOf(b) + String.valueOf(a);
        return Math.max(Integer.parseInt(s1), Integer.parseInt(s2));
    }
}