class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        String ans = "";
        for (int i = 0; i < my_strings.length; i++) {
            String s = my_strings[i];
            int a = parts[i][0], b = parts[i][1];
            ans += s.substring(a, b+1);
        }
        return ans;
    }
}