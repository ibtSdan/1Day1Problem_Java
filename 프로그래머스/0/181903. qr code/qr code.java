class Solution {
    public String solution(int q, int r, String code) {
        String ans = "";
        for (int i = 0; i < code.length(); i++) {
            if (i%q == r) {
                ans += code.substring(i, i+1);
            }
        }
        return ans;
    }
}