class Solution {
    public int solution(int left, int right) {
        int ans = 0;
        for (int i = left; i <= right; i++) {
            if (check(i)) {
                ans -= i;
            } else {
                ans += i;
            }
        }
        return ans;
    }
    
    public boolean check(int v) {
        return (int) Math.sqrt(v) == Math.sqrt(v);
    }
}