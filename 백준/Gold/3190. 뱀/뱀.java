import java.io.*;
import java.util.*;

public class Main {
    static BufferedWriter bw;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[][] board = new int[n+1][n+1];
        int apple_n = Integer.parseInt(br.readLine());
        for (int i = 0; i < apple_n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            board[Integer.parseInt(st.nextToken())][Integer.parseInt(st.nextToken())] = 1;
        } // 사과 위치는 1
        int di = Integer.parseInt(br.readLine());
        String[][] dire = new String[di][2];
        for (int i = 0; i < di; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            dire[i][0] = st.nextToken();
            dire[i][1] = st.nextToken();
        }

        int[] dx = {0, 1, 0, -1}; // 동 남 서 북
        int[] dy = {1, 0, -1, 0};
        int time = 0;
        int idx = 0;
        int d = 0;
        int x = 1, y = 1;
        Deque<int[]> snake = new ArrayDeque<>();
        snake.add(new int[] {1,1});
        boolean[][] isSnake = new boolean[n+1][n+1];
        isSnake[1][1] = true;
        while (true) {
            time++;
            int nx = x + dx[d], ny = y + dy[d];
            if (nx < 1 || nx > n || ny < 1 || ny > n || isSnake[nx][ny]) {
                break;
            }
            if (board[nx][ny] == 1) {
                board[nx][ny] = 0;
            } else {
                int[] i = snake.pollFirst();
                isSnake[i[0]][i[1]] = false;
            }
            snake.add(new int[] {nx, ny});
            isSnake[nx][ny] = true;
            x = nx;
            y = ny;

            if (idx < di && Integer.parseInt(dire[idx][0]) == time) {
                if (dire[idx][1].equals("D")) {
                    d = (1+d)%4;
                } else {
                    d = (3+d)%4;
                }
                idx++;
            }
        }
        bw.write(time+"\n");
        bw.flush();
    }
}
