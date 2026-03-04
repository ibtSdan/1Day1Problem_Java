class Solution {
    public int[] solution(String my_string) {
        int[] ans = new int[52];
        for (char c : my_string.toCharArray()) {
            if (Character.isUpperCase(c)) {
                ans[c-65]++;
            } else {
                ans[c-71]++;
            }
        }
        return ans;
    }
}