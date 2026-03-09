class Solution {
    public int[] dx = {-1,-1,0,1,1,1,0,-1};
    public int[] dy = {0,1,1,1,0,-1,-1,-1};
    
    public int solution(int[][] board) {
        int n  = board.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 1) {
                    for (int k = 0; k < 8; k++) {
                        int x = dx[k] + i;
                        int y = dy[k] + j;
                        if (x >= 0 && x < n && y >= 0 && y < n && board[x][y]==0) {
                            board[x][y] = -1;
                        }
                    }
                }
            }
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 0) {
                    ans++;
                }
            }
        }
        return ans;
    }
}