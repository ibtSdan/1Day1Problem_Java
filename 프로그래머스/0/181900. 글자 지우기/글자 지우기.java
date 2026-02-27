class Solution {
    public String solution(String my_string, int[] indices) {
        String ans = "";
        for (int i = 0; i < my_string.length(); i++) {
            boolean check = true;
            for (int idx : indices) {
                if (i == idx) {
                    check = false;
                    break;
                }
            }
            if (check) {
                ans += my_string.substring(i, i+1);
            }
        }
        return ans;
    }
}