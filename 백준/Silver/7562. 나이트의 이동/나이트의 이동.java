import java.io.*;
import java.util.*;

public class Main {
    static BufferedWriter bw;
    static int[] dx = {-2, -1, 1, 2, 2, 1, -1, -2};
    static int[] dy = {1, 2, 2, 1, -1, -2, -2, -1};
    static int[][] A;
    static boolean[][] visited;
    static int[][] dest;
    static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        for (int t = 0; t < T; t++) {
            n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int init_x = Integer.parseInt(st.nextToken());
            int init_y = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            int dest_x = Integer.parseInt(st.nextToken());
            int dest_y = Integer.parseInt(st.nextToken());
            A = new int[n][n];
            visited = new boolean[n][n];
            dest = new int[n][n];
            BFS(init_x, init_y, dest_x, dest_y);
        }
        bw.flush();
    }

    static void BFS(int init_x, int init_y, int dest_x, int dest_y) throws IOException {
        Deque<int[]> dq = new ArrayDeque<>();
        dq.addLast(new int[] {init_x, init_y});
        visited[init_x][init_y] = true;
        while (!dq.isEmpty()) {
            int[] now = dq.pollFirst();
            int i = now[0], j = now[1];
            if (i == dest_x && j == dest_y) {
                bw.write(dest[i][j]+"\n");
                return;
            }
            for (int k = 0; k < 8; k++) {
                int x = i + dx[k], y = j + dy[k];
                if (x >= 0 && x < n && y >= 0 && y < n && !visited[x][y]) {
                    visited[x][y] = true;
                    dq.addLast(new int[]{x, y});
                    dest[x][y] = dest[i][j] + 1;
                }
            }
        }

    }
}
