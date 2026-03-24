import java.io.*;
import java.util.*;

public class Main {
    static BufferedWriter bw;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] start = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
            int[][] store = new int[n][2];
            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());
                store[i][0] = Integer.parseInt(st.nextToken());
                store[i][1] = Integer.parseInt(st.nextToken());
            }
            st = new StringTokenizer(br.readLine());
            int[] end = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};

            Deque<int[]> dq = new ArrayDeque<>();
            dq.add(start);
            boolean[] visited = new boolean[n];
            boolean check = false;
            while (!dq.isEmpty()) {
                int[] now = dq.poll();
                if (dist(now, end) <= 1000) {
                    bw.write("happy\n");
                    check = true;
                    break;
                }
                for (int i = 0; i < n; i++) {
                    if (dist(now, store[i]) <= 1000 && !visited[i]) {
                        visited[i] = true;
                        dq.add(store[i]);
                    }
                }
            }
            if (!check) {
                bw.write("sad\n");
            }
        }
        bw.flush();
    }

    static int dist(int[] now, int[] store) {
        return Math.abs(now[0]-store[0]) + Math.abs(now[1]-store[1]);
    }
}
