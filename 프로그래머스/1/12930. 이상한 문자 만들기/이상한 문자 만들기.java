class Solution {
    public String solution(String s) {
        String ans = "";
        int idx = 0;
        int i = 0;
        while (idx < s.length()) {
            String temp = s.substring(idx, idx+1);
            if (temp.equals(" ")) {
                i = 0;
                ans += " ";
            } else if (i%2==0) {
                ans += temp.toUpperCase();
                i++;
            } else {
                ans += temp.toLowerCase();
                i++;
            }
            idx++;
        }
        return ans;
    }
}