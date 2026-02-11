import java.io.*;
import java.util.*;

public class Main {
    static BufferedWriter bw;
    static boolean[][] visited;
    static int[][] A;
    static int[] dx = {1,-1,0,0};
    static int[] dy = {0,0,1,-1};
    static int cnt, n;
    static ArrayList<Integer> ans;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));

        n = Integer.parseInt(br.readLine());
        visited = new boolean[n][n];
        A = new int[n][n];
        for (int i = 0; i < n; i++) {
            String st = br.readLine();
            for (int j = 0; j < n; j++) {
                A[i][j] = Integer.parseInt(st.substring(j,j+1));
            }
        }

        ans = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (A[i][j] == 1 && !visited[i][j]) {
                    cnt++;
                    BFS(i,j);
                }
            }
        }

        bw.write(cnt+"\n");
        Collections.sort(ans);
        for (int i : ans) {
            bw.write(i+"\n");
        }
        bw.flush();
    }

    static void BFS(int i, int j) {
        int house = 1;
        Deque<int[]> dq = new ArrayDeque<>();
        dq.addLast(new int[] {i, j});
        visited[i][j] = true;
        while (!dq.isEmpty()) {
            int[] now = dq.pollFirst();
            for (int k = 0; k < 4; k++) {
                int x = now[0] + dx[k];
                int y = now[1] + dy[k];
                if (x >= 0 && x < n && y >= 0 && y < n) {
                    if (A[x][y] == 1 && !visited[x][y]) {
                        dq.addLast(new int[] {x, y});
                        visited[x][y] = true;
                        house++;
                    }
                }
            }
        }
        ans.add(house);
    }
}
