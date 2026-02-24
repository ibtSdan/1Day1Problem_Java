class Solution {
    public int solution(int a, int b) {
        String s = String.valueOf(a) + String.valueOf(b);
        int A = Integer.parseInt(s);
        int B = 2 * a * b;
        return Math.max(A,B);
    }
}