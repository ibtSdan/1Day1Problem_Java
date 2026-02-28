class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for (int i = 0; i < queries.length; i++) {
            int[] now = queries[i];
            int s = now[0], e = now[1];
            for (int j = s; j <= e; j++) {
                arr[j]++;
            }
        }
        return arr;
    }
}