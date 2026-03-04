import java.util.*;

class Solution {
    public int[] solution(int n) {
        Set<Integer> set = new HashSet();
        int i = 2;
        while (n != 1) {
            while (n%i == 0) {
                set.add(i);
                n /= i;
            }
            i++;
        }
        int[] ans = new int[set.size()];
        int idx = 0;
        for (int x : set) {
            ans[idx] = x;
            idx++;
        }
        Arrays.sort(ans);
        return ans;
    }
}