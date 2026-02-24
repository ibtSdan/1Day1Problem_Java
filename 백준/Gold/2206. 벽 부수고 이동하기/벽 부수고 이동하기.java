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
        dq.addLast(new int[] {0,0,0});
        boolean[][][] visited = new boolean[n][m][2];
        visited[0][0][0] = true;
        int[][][] dist = new int[n][m][2];
        dist[0][0][0] = 1;

        while (!dq.isEmpty()) {
            int[] now = dq.pollFirst();
            int i = now[0], j = now[1], used = now[2];
            for (int k = 0; k < 4; k++) {
                int x = i + dx[k];
                int y = j + dy[k];
                if (x >= 0 && x < n && y >= 0 && y < m) {
                    if (A[x][y] == 1 && used == 1) {
                        continue;
                    } else if (A[x][y] == 1 && used == 0 && !visited[x][y][1]) {
                        visited[x][y][1] = true;
                        dist[x][y][1] = dist[i][j][0] + 1;
                        dq.addLast(new int[] {x,y,1});
                    } else if (A[x][y] == 0 && !visited[x][y][used]) {
                        visited[x][y][used] = true;
                        dist[x][y][used] = dist[i][j][used] + 1;
                        dq.addLast(new int[] {x,y,used});
                    }
                }
            }
        }

        int a = dist[n-1][m-1][0];
        int b = dist[n-1][m-1][1];
        if (a == 0 && b == 0) {
            bw.write("-1\n");
        } else if (a == 0 || b == 0) {
            bw.write(Math.max(a,b)+"\n");
        } else {
            bw.write(Math.min(a,b)+"\n");
        }
        bw.flush();
    }
}
