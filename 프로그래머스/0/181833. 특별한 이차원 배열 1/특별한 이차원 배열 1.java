class Solution {
    public int[][] solution(int n) {
        int[][] ans = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    ans[i][j] = 1;
                } else {
                    ans[i][j] = 0;
                }
            }
        }
        return ans;
    }
}