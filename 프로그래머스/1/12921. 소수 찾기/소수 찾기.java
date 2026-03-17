import java.util.*;

class Solution {
    public int solution(int n) {
        int[] num = new int[n+1];
        for (int i = 2; i <= n; i++) {
            num[i] = i;
        }
        boolean[] check = new boolean[n+1];
        Arrays.fill(check, true);
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (!check[i]) {
                continue;
            }
            for (int j = i+i; j <= n; j = j+i) {
                check[j] = false;
            }
        }
        int ans = 0;
        for (int i = 2; i <= n; i++) {
            if (check[i]) {
                ans++;
            }
        }
        return ans;
    }
}