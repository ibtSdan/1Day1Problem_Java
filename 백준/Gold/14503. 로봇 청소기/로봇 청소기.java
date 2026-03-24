import java.io.*;
import java.util.*;

public class Main {
    static BufferedWriter bw;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int[][] map = new int[n][m];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};
        int cnt = 0;
        while (true) {
            if (map[x][y] == 0) {
                map[x][y] = -1;
                cnt++;
                continue;
            }
            boolean check = false;
            for (int k = 0; k < 4; k++) {
                int nx = dx[k] + x, ny = dy[k] + y;
                if (nx >= 0 && nx < n && ny >= 0 && ny < m && map[nx][ny] == 0) {
                    check = true;
                    break;
                }
            }
            if (!check) {
                x -= dx[d];
                y -= dy[d];
                if (map[x][y] == 1) {
                    break;
                }
            } else {
                d = (d+3)%4;
                int nx = x + dx[d], ny = y + dy[d];
                if (nx >= 0 && nx < n && ny >= 0 && ny < m && map[nx][ny] == 0) {
                    x = nx;
                    y = ny;
                }
            }
        }
        bw.write(cnt+"\n");
        bw.flush();
    }
}
