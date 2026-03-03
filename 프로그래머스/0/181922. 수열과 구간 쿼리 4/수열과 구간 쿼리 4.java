class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for (int n = 0; n < queries.length; n++) {
            int s = queries[n][0], e = queries[n][1], k = queries[n][2];
            for (int i = s; i <= e; i++) {
                if (i%k==0) {
                    arr[i]++;
                }
            }
        }
        return arr;
    }
}