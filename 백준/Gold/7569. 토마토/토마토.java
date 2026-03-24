import java.io.*;
import java.util.*;

public class Main {
    static BufferedWriter bw;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
        Deque<int[]> dq = new ArrayDeque<>();
        int[][][] map = new int[n][m][h];
        boolean[][][] visited = new boolean[n][m][h];
        for (int k = 0; k < h; k++) {
            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < m; j++) {
                    map[i][j][k] = Integer.parseInt(st.nextToken());
                    if (map[i][j][k] == 1) {
                        dq.add(new int[] {i, j, k});
                        visited[i][j][k] = true;
                    }
                }
            }
        }
        int[] dx = {1,-1,0,0,0,0};
        int[] dy = {0,0,1,-1,0,0};
        int[] dz = {0,0,0,0,1,-1};
        while (!dq.isEmpty()) {
            int[] now = dq.poll();
            for (int k = 0; k < 6; k++) {
                int x = dx[k] + now[0], y = dy[k] + now[1], z = dz[k] + now[2];
                if (x >= 0 && x < n && y >= 0 && y < m && z >= 0 && z < h && map[x][y][z] == 0) {
                    map[x][y][z] = map[now[0]][now[1]][now[2]] + 1;
                    dq.add(new int[] {x,y,z});
                    visited[x][y][z] = true;
                }
            }
        }

        int ans = -1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                for (int k = 0; k < h; k++) {
                    if (map[i][j][k] == 0) {
                        System.out.println("-1\n");
                        return;
                    }
                    ans = Math.max(ans, map[i][j][k]);
                }
            }
        }
        bw.write(ans-1+"\n");
        bw.flush();
    }
}
