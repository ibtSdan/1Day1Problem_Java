import java.io.*;
import java.util.*;

public class Main {
    static BufferedWriter bw;
    static boolean[][] visited;
    static int[][] A;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        A = new int[n][m];
        visited = new boolean[n][m];
        Deque<int[]> dq = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                A[i][j] = Integer.parseInt(st.nextToken());
                if (A[i][j] == 1) {
                    dq.addLast(new int[] {i,j});
                    visited[i][j] = true;
                }
            }
        }

        int[] dx = {1,-1,0,0};
        int[] dy = {0,0,1,-1};
        while (!dq.isEmpty()) {
            int[] now = dq.pollFirst();
            for (int k = 0; k < 4; k++) {
                int x = now[0] + dx[k];
                int y = now[1] + dy[k];
                if (x >= 0 && x < n && y >= 0 && y < m) {
                    if (A[x][y] == 0 && !visited[x][y]) {
                        visited[x][y] = true;
                        A[x][y] = A[now[0]][now[1]] + 1;
                        dq.add(new int[] {x,y});
                    }
                }
            }
        }

        int ans = 0;
        boolean zero = false;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (A[i][j] == 0) {
                    zero = true;
                    break;
                } else if (A[i][j] > ans) {
                    ans = A[i][j];
                }
            }
            if (zero) {
                break;
            }
        }

        if (zero) {
            bw.write("-1\n");
        } else {
            bw.write(ans-1+"\n");
        }
        bw.flush();
    }
}
