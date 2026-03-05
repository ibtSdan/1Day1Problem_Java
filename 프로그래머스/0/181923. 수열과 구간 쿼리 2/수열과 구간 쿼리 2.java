class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] ans = new int [queries.length];
        for (int i = 0; i < queries.length; i++) {
            int s = queries[i][0], e = queries[i][1], k = queries[i][2];
            int min = 1000001;
            for (int j = s; j <= e; j++) {
                if (arr[j] > k) {
                    min = Math.min(min, arr[j]);
                }
            }
            ans[i] = min == 1000001 ? -1 : min;
        }
        return ans;
    }
}