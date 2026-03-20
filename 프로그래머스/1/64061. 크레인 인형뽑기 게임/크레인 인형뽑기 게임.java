import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        ArrayList<Integer> A = new ArrayList<>();
        int n = board.length;
        int ans = 0;
        for (int m : moves) {
            for (int i = 0; i < n; i++) {
                if (board[i][m-1] != 0) {
                    A.add(board[i][m-1]);
                    board[i][m-1] = 0;
                    break;
                }
            }
            if (A.size() >= 2 && A.get(A.size()-1) == A.get(A.size()-2)) {
                A.remove(A.size()-1);
                A.remove(A.size()-1);
                ans += 2;
            }
        }
        return ans;
    }
}