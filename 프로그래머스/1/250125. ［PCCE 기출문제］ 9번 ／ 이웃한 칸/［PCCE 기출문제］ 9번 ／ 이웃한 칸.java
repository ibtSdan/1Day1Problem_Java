class Solution {
    public int solution(String[][] board, int h, int w) {
        int count = 0;
        int n = board.length;
        int[] dx = {1,-1,0,0};
        int[] dy = {0,0,1,-1};
        for (int k = 0; k < 4; k++) {
            int x = h+dx[k];
            int y = w+dy[k];
            if (x >= 0 && x < n && y >= 0 && y < n) {
                if (board[h][w].equals(board[x][y])) {
                    count++;
                }
            }
        }
        return count;
    }
}