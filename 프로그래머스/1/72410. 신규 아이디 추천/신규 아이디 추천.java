class Solution {
    public String solution(String new_id) {
        new_id = new_id.toLowerCase();
        String ans = "";
        for (char c : new_id.toCharArray()) {
            if (Character.isLowerCase(c) || Character.isDigit(c) || c == '-' || c == '_') {
                ans += c;
            } else if (c == '.') {
                if (ans.length() != 0 && ans.charAt(ans.length()-1) != '.') {
                    ans += c;
                }
            }
        }
        if (ans.length() != 0 && ans.charAt(0) == '.') {
            ans = ans.substring(1, ans.length());
        }
        if (ans.length() != 0 && ans.charAt(ans.length()-1) == '.') {
            ans = ans.substring(0, ans.length()-1);
        }
        if (ans.length() == 0) {
            ans = "a";
        }
        if (ans.length() >= 16) {
            ans = ans.substring(0, 15);
        }
        if (ans.length() != 0 && ans.charAt(ans.length()-1) == '.') {
            ans = ans.substring(0, ans.length()-1);
        }
        if (ans.length() <= 2) {
            int temp = ans.length();
            for (int i = 0; i < 3 - temp; i++) {
                ans += ans.charAt(ans.length()-1);
            }
        }
        
        return ans;
    }
}