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
        int[][] A = new int[n][m];
        boolean[][] visited = new boolean[n][m];
        int[][] dist = new int[n][m];
        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            for (int j = 0; j < m; j++) {
                A[i][j] = line.charAt(j) - '0';
            }
        }
        dist[0][0] = 1;
        Deque<int[]> dq = new ArrayDeque<>();
        dq.addLast(new int[] {0,0});
        visited[0][0] = true;
        int[] dx = {1,-1,0,0};
        int[] dy = {0,0,1,-1};
        while (!dq.isEmpty()) {
            int[] now = dq.pollFirst();
            int i = now[0], j = now[1];
            for (int k = 0; k < 4; k++) {
                int x = i + dx[k], y = j + dy[k];
                if (x >= 0 && x < n && y >= 0 && y < m && A[x][y] == 1 && !visited[x][y]) {
                    visited[x][y] = true;
                    dq.addLast(new int[] {x,y});
                    dist[x][y] = dist[i][j] + 1;
                }
            }
        }
        bw.write(dist[n-1][m-1]+"\n");
        bw.flush();
    }
}
