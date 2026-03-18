class Solution {
    public String solution(String s, String skip, int index) {
        String ans = "";
        for (char c : s.toCharArray()) {
            int cnt = 0;
            while (cnt < index) {
                c += 1;
                if (c == 123) {
                    c = 'a';
                }
                if (skip.contains(String.valueOf(c))) {
                    continue;
                }
                cnt++;
            }
            ans += c;
        }
        return ans;
    }
}