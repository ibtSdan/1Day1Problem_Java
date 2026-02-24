import java.util.*;
class Solution {
    public int[] solution(int[] num_list) {
        int n = num_list.length;
        int[] ans = new int[n + 1];
        for (int i = 0; i < n; i++) {
            ans[i] = num_list[i];
        }
        ans[n] = num_list[n-1] > num_list[n-2] ? num_list[n-1]-num_list[n-2] : num_list[n-1]*2;
        return ans;
    }
}