class Solution {
    public int solution(int[][] dots) {
        int a = -256, b = -256, c = 256, d = 256;
        for (int[] dot : dots) {
            a = Math.max(dot[0], a);
            b = Math.max(dot[1], b);
            c = Math.min(dot[0], c);
            d = Math.min(dot[1], d);
        }
        return (a-c) * (b-d);
    }
}