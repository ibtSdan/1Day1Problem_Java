class Solution {
    public int solution(int a, int d, boolean[] included) {
        int ans = 0;
        for (int i = 0; i < included.length; i++) {
            int num = a + d*i;
            if (included[i]) {
                ans += num;
            }
        }
        return ans;
    }
}