class Solution {
    public int solution(int[][] dots) {
        int[] a = dots[0], b = dots[1], c = dots[2], d = dots[3];
        double A1 = 0.0, A2 = 0.0, B1 = 0.0, B2 = 0.0;
        // a, b
        A1 = a[0] - b[0];
        A2 = a[1] - b[1];
        B1 = c[0] - d[0];
        B2 = c[1] - d[1];
        if (A1/A2 == B1/B2) {
            return 1;
        }

        // a, c
        A1 = a[0] - c[0];
        A2 = a[1] - c[1];
        B1 = b[0] - d[0];
        B2 = b[1] - d[1];
        if (A1/A2 == B1/B2) {
            return 1;
        }
        
        // a. d
        A1 = a[0] - d[0];
        A2 = a[1] - d[1];
        B1 = b[0] - c[0];
        B2 = b[1] - c[1];
        if (A1/A2 == B1/B2) {
            return 1;
        }
        return 0;
    }
}