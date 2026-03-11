class Solution {
    public int solution(int[][] sizes) {
        int a = 0, b = 0;
        for (int[] size : sizes) {
            int max = Math.max(size[0], size[1]);
            int min = Math.min(size[0], size[1]);
            a = Math.max(a, max);
            b = Math.max(b, min);
        }
        return a*b;
    }
}