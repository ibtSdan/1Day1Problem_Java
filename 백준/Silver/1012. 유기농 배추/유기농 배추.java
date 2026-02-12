import java.io.*;
import java.util.*;

public class Main {
    static BufferedWriter bw;
    static boolean[][] visited;
    static int[][] A;
    static int[] dx = {1,-1,0,0};
    static int[] dy = {0,0,1,-1};
    static int n, m;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        for (int T = 0; T < N; T++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            visited = new boolean[n][m];
            A = new int[n][m];
            for (int i = 0; i < k; i++) {
                st = new StringTokenizer(br.readLine());
                A[Integer.parseInt(st.nextToken())][Integer.parseInt(st.nextToken())] = 1;
            }
            int cnt = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (A[i][j] == 1 && !visited[i][j]) {
                        cnt++;
                        BFS(i,j);
                    }
                }
            }
            bw.write(cnt+"\n");
            bw.flush();
        }
    }
    static void BFS(int a, int b) {
        visited[a][b] = true;
        Deque<int[]> dq = new ArrayDeque<>();
        dq.addLast(new int[] {a,b});
        while (!dq.isEmpty()) {
            int[] now = dq.pollFirst();
            for (int k = 0; k < 4; k++) {
                int x = now[0] + dx[k];
                int y = now[1] + dy[k];
                if (x >= 0 && x < n && y >= 0 && y < m) {
                    if (A[x][y] == 1 && !visited[x][y]) {
                        visited[x][y] = true;
                        dq.addLast(new int[] {x,y});
                    }
                }
            }
        }
    }
}
