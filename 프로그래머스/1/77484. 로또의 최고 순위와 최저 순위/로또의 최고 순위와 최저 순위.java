class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        // 맞는 개수 + 0개수 -> 최고
        // 맞는 개수 -> 최저
        int[] cnt = new int[2];
        int zero = 0;
        for (int i = 0; i < 6; i++) {
            if (lottos[i] == 0) {
                zero++;
                continue;
            }
            for (int j = 0; j < 6; j++) {
                if (lottos[i] == win_nums[j]) {
                    cnt[0]++;
                    cnt[1]++;
                }
            }
        }
        cnt[0] += zero;
        
        int[] ans = new int[2];
        if (cnt[0] <= 1) {
            ans[0] = 6;
        } else {
            ans[0] = 7 - cnt[0];
        }
        if (cnt[1] <= 1) {
            ans[1] = 6;
        } else {
            ans[1] = 7 - cnt[1];
        }
        return ans;
    }
}