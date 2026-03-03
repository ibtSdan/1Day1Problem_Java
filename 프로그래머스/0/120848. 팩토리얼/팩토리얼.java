class Solution {
    public int solution(int n) {
        for (int i = 10; i > 0; i--) {
            if (fac(i) <= n) {
                return i;
            }
        }
        return 0;
    }
    
    public int fac(int v) {
        if (v == 1) {
            return v;
        } else {
            return v * fac(v-1);
        }
    }
}