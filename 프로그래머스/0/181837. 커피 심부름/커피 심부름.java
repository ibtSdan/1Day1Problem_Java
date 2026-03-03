class Solution {
    public int solution(String[] order) {
        int ans = 0;
        for (String s : order) {
            if (s.equals("iceamericano") || s.equals("americanoice")
               || s.equals("americano") || s.equals("anything")
               || s.equals("hotamericano") || s.equals("americanohot")) {
                ans += 4500;
            } else {
                ans += 5000;
            }
        }
        return ans;
    }
}