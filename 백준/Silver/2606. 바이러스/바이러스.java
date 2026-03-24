import java.io.*;
import java.util.*;

public class Main {
    static BufferedWriter bw;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        ArrayList<Integer>[] A = new ArrayList[n+1];
        for (int i = 1; i <= n; i++) {
            A[i] = new ArrayList<>();
        }
        boolean[] visited = new boolean[n+1];
        for (int i = 0; i < m; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            A[u].add(v);
            A[v].add(u);
        }
        Deque<Integer> dq = new ArrayDeque<>();
        dq.add(1);
        visited[1] = true;
        int cnt = 0;
        while (!dq.isEmpty()) {
            int now = dq.poll();
            for (int i : A[now]) {
                if (!visited[i]) {
                    visited[i] = true;
                    dq.add(i);
                    cnt++;
                }
            }
        }
        bw.write(cnt+"\n");
        bw.flush();
    }
}
