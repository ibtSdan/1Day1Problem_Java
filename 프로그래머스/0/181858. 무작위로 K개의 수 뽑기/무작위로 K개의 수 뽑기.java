import java.util.*;
class Solution {
    static int[] ans;
    public int[] solution(int[] arr, int k) {
        ans = new int[k];
        Arrays.fill(ans, -1);
        int idx = 0;
        for (int i : arr) {
            if (!search(i)) {
                ans[idx] = i;
                idx++;
            }
            if (idx == k) {
                break;
            }
        }
        return ans;
    }
    
    public boolean search(int v) {
        for (int i : ans) {
            if (v == i) {
                return true;
            }
        }
        return false;
    }
}