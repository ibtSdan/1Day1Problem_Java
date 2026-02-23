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
        for (int i = 0; i < n; i++) {
            char[] c = br.readLine().toCharArray();
            for (int j = 0; j < m; j++) {
                A[i][j] = c[j] - '0';
            }
        }
        if (n == 1 && m == 1) {
            System.out.println(1);
            return;
        }

        int[] dx = new int[] {1,-1,0,0};
        int[] dy = new int[] {0,0,1,-1};

        Deque<int[]> dq = new ArrayDeque<>();
        boolean[][][] visited = new boolean[n][m][2];
        dq.addLast(new int[] {0,0,0});
        visited[0][0][0] = true;
        int[][][] dist = new int[n][m][2];
        dist[0][0][0] = 1;

        while (!dq.isEmpty()) {
            int[] now = dq.pollFirst();
            int i = now[0], j = now[1], used = now[2]; //0 안부숨, 1 부숨
            for (int k = 0; k < 4; k++) {
                int x = i + dx[k];
                int y = j + dy[k];
                if (x >= 0 && x < n && y >= 0 && y < m) {
                    if (A[x][y] == 1 && used == 1) {
                        continue;
                    } else if (A[x][y] == 1 && used == 0 && !visited[x][y][1]) {
                        dist[x][y][1] = dist[i][j][0] + 1;
                        dq.addLast(new int[] {x,y,1});
                        visited[x][y][1] = true;
                    } else if (A[x][y] == 0 && !visited[x][y][used]) {
                        dist[x][y][used] = dist[i][j][used] + 1;
                        dq.addLast(new int[] {x,y,used});
                        visited[x][y][used] = true;
                    }
                }
            }
        }
        int a = dist[n-1][m-1][0];
        int b = dist[n-1][m-1][1];
        if (a == 0 && b == 0) {
            System.out.println(-1);
        } else if (a == 0 || b == 0){
            System.out.println(Math.max(a,b));
        } else {
            System.out.println(Math.min(a,b));
        }
    }
}
