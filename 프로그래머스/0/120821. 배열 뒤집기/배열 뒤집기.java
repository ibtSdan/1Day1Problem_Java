class Solution {
    public int[] solution(int[] num_list) {
        int[] ans = new int[num_list.length];
        for (int i = num_list.length - 1; i >= 0; i--) {
            ans[num_list.length - i - 1] = num_list[i];
        }
        return ans;
    }
}