import java.io.*;
import java.util.*;

public class Main {
    static BufferedWriter bw;
    static boolean[][] visited;
    static int[][] map;
    static int[] dx = {1,-1,0,0};
    static int[] dy = {0,0,1,-1};
    static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        n = Integer.parseInt(br.readLine());
        int[][] A = new int[n][n];
        int max = 0;
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                A[i][j] = Integer.parseInt(st.nextToken());
                max = Math.max(max, A[i][j]);
            }
        }

        ArrayList<Integer> ans = new ArrayList<>();
        for (int rain = 0; rain <= max; rain++) {
            map = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    map[i][j] = A[i][j] <= rain ? 0 : 1;
                }
            }
            visited = new boolean[n][n];
            int cnt = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (map[i][j] == 1 && !visited[i][j]) {
                        BFS(i, j);
                        cnt++;
                    }
                }
            }
            ans.add(cnt);
        }
        Collections.sort(ans, Comparator.reverseOrder());
        bw.write(ans.get(0)+"\n");
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
                if (x >= 0 && x < n && y >= 0 && y < n && map[x][y] == 1 && !visited[x][y]) {
                    dq.add(new int[] {x, y});
                    visited[x][y] = true;
                }
            }
        }
    }
}
