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
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        visited = new boolean[n][m];
        A = new int[n][m];
        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            for (int j = 0; j < m; j++) {
                A[i][j] = Integer.parseInt(line.substring(j,j+1));
            }
        }
        BFS(0,0);
        bw.write(A[n-1][m-1]+"\n");
        bw.flush();
    }

    static void BFS(int i, int j) {
        Deque<int[]> dq = new ArrayDeque<>();
        dq.addLast(new int[]{i, j});
        visited[i][j] = true;
        while (!dq.isEmpty()) {
            int[] now = dq.pollFirst();
            for (int k = 0; k < 4; k++) {
                int x = dx[k] + now[0];
                int y = dy[k] + now[1];
                if (x >= 0 && x < n && y >= 0 && y < m ) {
                    if (A[x][y] != 0 && !visited[x][y]) {
                        A[x][y] = A[now[0]][now[1]] + 1;
                        visited[x][y] = true;
                        dq.addLast(new int[] {x, y});
                    }
                }
            }
        }
    }
}
