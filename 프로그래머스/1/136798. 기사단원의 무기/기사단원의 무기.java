class Solution {
    public int solution(int number, int limit, int power) {
        int ans = 0;
        for (int i = 1; i <= number; i++) {
            int need = cal(i);
            if (need > limit) {
                ans += power;
            } else {
                ans += need;
            }
        }
        return ans;
    }
    
    public int cal(int v) {
        int cnt = 0;
        for (int i = 1; i < Math.sqrt(v); i++) {
            if (v%i == 0) {
                cnt += 2;
            }
        }
        if ((int)Math.sqrt(v) == Math.sqrt(v)) {
            return cnt+1;
        }
        return cnt;
    }
}