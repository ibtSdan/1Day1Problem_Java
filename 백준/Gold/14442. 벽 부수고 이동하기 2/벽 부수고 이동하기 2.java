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
        int k = Integer.parseInt(st.nextToken());
        int[][] A = new int[n+1][m+1];
        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            for (int j = 0; j < m; j++) {
                A[i][j] = line.charAt(j) - '0';
            }
        }
        int[] dx = {1,-1,0,0};
        int[] dy = {0,0,1,-1};

        Deque<int[]> dq = new ArrayDeque<>();
        boolean[][][] visited = new boolean[n][m][k+1];
        int[][][] dist = new int[n][m][k+1];
        dist[0][0][0] = 1;
        dq.addLast(new int[] {0,0,0});
        visited[0][0][0] = true;

        while (!dq.isEmpty()) {
            int[] now = dq.pollFirst();
            int i = now[0], j = now[1], used = now[2];
            for (int idx = 0; idx < 4; idx++) {
                int x = i + dx[idx], y = j + dy[idx];
                if (x >= 0 && x < n && y >= 0 && y < m) {
                    if (A[x][y] == 1 && used == k) {
                        continue;
                    } else if (A[x][y] == 1 && used < k && !visited[x][y][used+1]) {
                        visited[x][y][used+1] = true;
                        dq.addLast(new int[] {x,y,used+1});
                        dist[x][y][used+1] = dist[i][j][used] + 1;
                    } else if (A[x][y] == 0 && !visited[x][y][used]) {
                        visited[x][y][used] = true;
                        dq.addLast(new int[] {x,y,used});
                        dist[x][y][used] = dist[i][j][used] + 1;
                    }
                }
            }
        }

        int[] ans = new int[k+1];
        for (int i = 0; i < k+1; i++) {
            ans[i] = dist[n-1][m-1][i];
        }

        int min = 10000000;
        for (int i = 0; i < k+1; i++) {
            if (ans[i] != 0) {
                min = Math.min(min, ans[i]);
            }
        }

        if (min == 10000000) {
            bw.write("-1\n");
        } else {
            bw.write(min+"\n");
        }
        bw.flush();
    }
}
