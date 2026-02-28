class Solution {
    static String pat;
    public String solution(String myString, String p) {
        pat = p;
        String ans = "";
        for (int i = pat.length()-1; i < myString.length(); i++) {
            String sub = myString.substring(0, i+1);
            if (check(sub)) {
                if (ans.length() < sub.length()) {
                    ans = sub;
                }
            }
        }
        return ans;
    }
    
    static boolean check(String sub) {
        String s = sub.substring(sub.length()-pat.length(), sub.length());
        if (s.equals(pat)) {
            return true;
        }
        return false;
    }
}