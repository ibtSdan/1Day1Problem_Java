import java.util.*;

class Solution {
    public int[][] solution(int[][] arr) {
        int a = arr.length;
        int b = arr[0].length;
        if (a > b) {
            int[][] ans = new int[a][a];
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < b; j++) {
                    ans[i][j] = arr[i][j];
                }
            }
            return ans;
        } else if (a < b) {
            int[][] ans = new int[b][b];
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < b; j++) {
                    ans[i][j] = arr[i][j];
                }
            }
            return ans;
        }
        return arr;
    }
}