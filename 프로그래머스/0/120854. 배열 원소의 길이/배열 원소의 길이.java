class Solution {
    public int[] solution(String[] strlist) {
        int[] ans = new int[strlist.length];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = strlist[i].length();
        }
        return ans;
    }
}