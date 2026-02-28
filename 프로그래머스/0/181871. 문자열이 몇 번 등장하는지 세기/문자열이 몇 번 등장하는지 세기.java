class Solution {
    public int solution(String myString, String pat) {
        int ans = 0;
        for (int i = 0; i < myString.length()-pat.length()+1; i++) {
            String sub = myString.substring(i, i+pat.length());
            if (sub.equals(pat)) {
                ans++;
            }
        }
        return ans;
    }
}