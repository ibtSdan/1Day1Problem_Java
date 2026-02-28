class Solution {
    public int solution(int[] num_list) {
        int ans = 0;
        for (int i : num_list) {
            ans += cal(i);
        }
        return ans;
    }
    
    static int cal(int v) {
        int cnt = 0;
        while (v != 1) {
            if (v%2 == 0) {
                v /= 2;
            } else {
                v = (v-1)/2;
            }
            cnt++;
        }
        return cnt;
    }
}