class Solution {
    public int solution(int n) {
        String s = Integer.toString(n, 3);
        String ss = new StringBuilder(s).reverse().toString();
        return Integer.parseInt(ss, 3);
    }
}