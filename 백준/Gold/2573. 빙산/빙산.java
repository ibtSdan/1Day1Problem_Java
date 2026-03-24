import java.io.*;
import java.util.*;

public class Main {
    static BufferedWriter bw;
    static int[] dx = {1,-1,0,0};
    static int[] dy = {0,0,1,-1};
    static int[][] map, A;
    static int n, m;
    static boolean[][] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        A = new int[n][m];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                A[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int year = 0;
        while (true) {
            map = new int[n][m];
            year++;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (A[i][j] != 0) {
                        map[i][j] = count(i, j);
                    }
                }
            }
            int cnt = 0;
            visited = new boolean[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (map[i][j] != 0 && !visited[i][j]) {
                        cnt++;
                        BFS(i, j);
                    }
                }
            }
            if (cnt >= 2) {
                bw.write(year+"\n");
                break;
            } else if (cnt == 0) {
                bw.write("0\n");
                break;
            }
            A = map;
        }
        bw.flush();
    }

    static void BFS(int u, int v) {
        Deque<int[]> dq = new ArrayDeque<>();
        dq.add(new int[] {u, v});
        visited[u][v] = true;
        while (!dq.isEmpty()) {
            int[] now = dq.poll();
            for (int k = 0; k < 4; k++) {
                int x = dx[k] + now[0], y = dy[k] + now[1];
                if (x >= 0 && x < n && y >= 0 && y < m && map[x][y] != 0 && !visited[x][y]) {
                    visited[x][y] = true;
                    dq.addLast(new int[] {x, y});
                }
            }
        }
    }

    static int count(int i, int j) {
        int cnt = 0;
        for (int k = 0; k < 4; k++) {
            int x = dx[k] + i, y = dy[k] + j;
            if (x >= 0 && x < n && y >= 0 && y < m && A[x][y] == 0) {
                cnt++;
            }
        }
        return Math.max(A[i][j]-cnt, 0);
    }
}
