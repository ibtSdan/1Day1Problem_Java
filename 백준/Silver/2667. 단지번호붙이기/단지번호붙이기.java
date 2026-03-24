import java.io.*;
import java.util.*;

public class Main {
    static BufferedWriter bw;
    static int[][] A;
    static boolean[][] visited;
    static int[] dx = {1,-1,0,0};
    static int[] dy = {0,0,1,-1};
    static ArrayList<Integer> ans = new ArrayList<>();
    static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        n = Integer.parseInt(br.readLine());
        A = new int[n][n];
        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            for (int j = 0; j < n; j++) {
                A[i][j] = Integer.parseInt(line.substring(j, j+1));
            }
        }
        int cnt = 0;
        visited = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (A[i][j] == 1 && !visited[i][j]) {
                    cnt++;
                    BFS(i, j);
                }
            }
        }
        Collections.sort(ans);
        bw.write(cnt+"\n");
        for (int i : ans) {
            bw.write(i+"\n");
        }
        bw.flush();
    }

    static void BFS(int u, int v) {
        Deque<int[]> dq = new ArrayDeque<>();
        dq.add(new int[] {u, v});
        int cnt = 1;
        visited[u][v] = true;
        while (!dq.isEmpty()) {
            int[] now = dq.poll();
            for (int k = 0; k < 4; k++) {
                int x = dx[k] + now[0], y = dy[k] + now[1];
                if (x >= 0 && x < n && y >= 0 && y < n && A[x][y] == 1 && !visited[x][y]) {
                    visited[x][y] = true;
                    cnt++;
                    dq.addLast(new int[] {x, y});
                }
            }
        }
        ans.add(cnt);
    }
}
