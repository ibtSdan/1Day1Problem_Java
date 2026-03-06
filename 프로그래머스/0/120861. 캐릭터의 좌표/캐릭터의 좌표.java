class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] ans = {0, 0};
        for (String s : keyinput) {
            if (s.equals("left")) {
                ans[0] = ans[0]-1 >= -board[0]/2 ? ans[0]-1 : ans[0];
            } else if (s.equals("right")) {
                ans[0] = ans[0]+1 <= board[0]/2 ? ans[0]+1 : ans[0];
            } else if (s.equals("up")) {
                ans[1] = ans[1]+1 <= board[1]/2 ? ans[1]+1 : ans[1];
            } else {
                ans[1] = ans[1]-1 >= -board[1]/2 ? ans[1]-1 : ans[1];
            }
        }
        return ans;
    }
}