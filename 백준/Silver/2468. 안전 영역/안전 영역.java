import java.io.*;
import java.util.*;

public class Main {
    static BufferedWriter bw;
    static boolean[][] visited;
    static int[][] map;
    static int n;
    static int[] dx = {1,-1,0,0};
    static int[] dy = {0,0,1,-1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        n = Integer.parseInt(br.readLine());
        int[][] A = new int[n][n];
        int max_h = 0;
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                A[i][j] = Integer.parseInt(st.nextToken());
                max_h = Math.max(max_h, A[i][j]);
            }
        }

        int ans = 0; // 전부 잠김
        for (int h = 0; h < max_h; h++) {
            map = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (A[i][j] <= h) {
                        map[i][j] = 0;
                    } else {
                        map[i][j] = 1;
                    }
                }
            }
            visited = new boolean[n][n];
            int cnt = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (map[i][j] == 1 && !visited[i][j]) {
                        cnt++;
                        BFS(i,j);
                    }
                }
            }
            ans = Math.max(ans, cnt);
        }
        bw.write(ans+"\n");
        bw.flush();
    }

    static void BFS(int u, int v) {
        visited[u][v] = true;
        Deque<int[]> dq = new ArrayDeque<>();
        dq.addLast(new int[] {u, v});
        while (!dq.isEmpty()) {
            int[] now = dq.pollFirst();
            int i = now[0], j = now[1];
            for (int k = 0; k < 4; k++) {
                int x = i + dx[k], y = j + dy[k];
                if (x >= 0 && x < n && y >= 0 && y < n && map[x][y] == 1 && !visited[x][y]) {
                    visited[x][y] = true;
                    dq.addLast(new int[] {x, y});
                }
            }
        }
    }
}
