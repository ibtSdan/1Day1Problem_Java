class Solution {
    public int solution(int[] array) {
        int ans = 0;
        for (int i : array) {
            ans += count(i);
        }
        return ans;
    }
    
    public int count(int v) {
        int cnt = 0;
        for (char c : String.valueOf(v).toCharArray()) {
            if (c - '0' == 7) {
                cnt++;
            }
        }
        return cnt;
    }
}