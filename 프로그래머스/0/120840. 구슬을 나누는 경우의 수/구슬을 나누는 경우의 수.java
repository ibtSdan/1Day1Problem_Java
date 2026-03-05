class Solution {
    public int solution(int balls, int share) {
        int[][] D = new int[balls+1][balls+1];
        for (int i = 1; i <= balls; i++) {
            D[i][0] = 1;
            D[i][i] = 1;
            D[i][1] = i;
        }
        for (int i = 3; i <= balls; i++) {
            for (int j = 2; j < i; j++) {
                D[i][j] = D[i-1][j-1] + D[i-1][j];
            }
        }
        return D[balls][share];
    }
}