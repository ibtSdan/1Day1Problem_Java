class Solution {
    public int solution(String s) {
        int ans = 0;
        String[] string = s.split(" ");
        for (int i = 0; i < string.length; i++) {
            if (string[i].equals("Z")) {
                ans -= Integer.parseInt(string[i-1]);
            } else {
                ans += Integer.parseInt(string[i]);
            }
        }
        return ans;
    }
}