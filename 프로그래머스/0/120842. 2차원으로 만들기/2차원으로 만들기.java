class Solution {
    public int[][] solution(int[] num_list, int n) {
        int[][] ans = new int[num_list.length/n][n];
        int idx = 0;
        for (int i = 0; i < num_list.length/n; i++) {
            for (int j = 0; j < n; j++) {
                ans[i][j] = num_list[idx];
                idx++;
            }
        }
        return ans;
    }
}