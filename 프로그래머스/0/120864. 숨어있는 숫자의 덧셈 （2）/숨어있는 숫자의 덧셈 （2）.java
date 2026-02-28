class Solution {
    public int solution(String my_string) {
        String s = "";
        for (char c : my_string.toCharArray()) {
            if (Character.isDigit(c)) {
                s += c;
            } else {
                s += " ";
            }
        }
        s = s.replaceAll("^\\s+", "");
        if (s.equals("")) {
            return 0;
        }
        String[] arr = s.split("\\s+");
        int ans = 0;
        for (String ss : arr) {
            ans += Integer.parseInt(ss);
        }
        return ans;
    }
}