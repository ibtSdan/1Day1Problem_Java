class Solution {
    public int[] solution(long n) {
        String s = String.valueOf(n);
        int[] ans = new int[s.length()];
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        s = sb.reverse().toString();
        for (int i = 0; i < s.length(); i++) {
            ans[i] = Integer.parseInt(s.substring(i, i+1));
        }
        return ans;
    }
}