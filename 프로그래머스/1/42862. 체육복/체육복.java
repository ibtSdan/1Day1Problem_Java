import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        Arrays.sort(lost);
        Arrays.sort(reserve);
        boolean[] have = new boolean[n+1];
        Arrays.fill(have, true);
        ArrayList<Integer> A = new ArrayList<>();
        
        for (int i : lost) {
            have[i] = false;
            A.add(i);
        }
        for (int i : reserve) {
            have[i] = true;
        }
        
        for (int i : reserve) {
            if (A.contains(i)) {
                continue;
            }
            if (i-1 >= 1 && !have[i-1]) {
                have[i-1] = true;
            } else if (i+1 <= n && !have[i+1]) {
                have[i+1] = true;
            }
        }
        
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            if (have[i]) {
                ans++;
            }
        }
        return ans;
    }
}