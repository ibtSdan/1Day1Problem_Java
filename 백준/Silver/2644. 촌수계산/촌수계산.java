import java.io.*;
import java.util.*;

public class Main {
    static BufferedWriter bw;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(br.readLine());
        ArrayList<Integer>[] A = new ArrayList[n+1];
        for (int i = 1; i <= n; i++) {
            A[i] = new ArrayList<>();
        }
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken()), v = Integer.parseInt(st.nextToken());
            A[u].add(v);
            A[v].add(u);
        }
        Deque<Integer> dq = new ArrayDeque<>();
        boolean[] visited = new boolean[n+1];
        dq.add(a);
        visited[a] = true;
        int[] dist = new int[n+1];
        while (!dq.isEmpty()) {
            int now = dq.poll();
            for (int i : A[now]) {
                if (!visited[i]) {
                    dist[i] = dist[now] + 1;
                    dq.addLast(i);
                    visited[i] = true;
                }
            }
        }
        bw.write(dist[b] == 0 ? -1+"\n" : dist[b]+"\n");
        bw.flush();
    }
}
