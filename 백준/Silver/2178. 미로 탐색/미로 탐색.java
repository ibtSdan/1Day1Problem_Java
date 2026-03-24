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
            String line = br.readLine();
            for (int j = 0; j < m; j++) {
                A[i][j] = Integer.parseInt(line.substring(j, j+1));
            }
        }
        int[] dx = {1,-1,0,0};
        int[] dy = {0,0,1,-1};
        Deque<int[]> dq = new ArrayDeque<>();
        dq.add(new int[] {0,0});
        while (!dq.isEmpty()) {
            int[] now = dq.poll();
            for (int k = 0; k < 4; k++) {
                int x = now[0] + dx[k];
                int y = now[1] + dy[k];
                if (x >= 0 && x < n && y >= 0 && y < m && A[x][y] == 1) {
                    A[x][y] = A[now[0]][now[1]]+1;
                    dq.addLast(new int[] {x, y});
                }
            }
        }
        bw.write(A[n-1][m-1]+"\n");
        bw.flush();
    }
}
