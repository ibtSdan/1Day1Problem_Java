class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int[] have = new int[n+1];
        for (int l : lost) {
            have[l]--;
        }
        for (int r : reserve) {
            have[r]++;
        }
        int ans = n;
        for (int i = 1; i <= n; i++) {
            if (have[i] == -1) {
                if (i-1 >= 1 && have[i-1] == 1) {
                    have[i]++;
                    have[i-1]--;
                } else if (i+1 <= n && have[i+1] == 1) {
                    have[i]++;
                    have[i+1]--;
                } else {
                    ans--;
                }
            }
        }
        return ans;
    }
}