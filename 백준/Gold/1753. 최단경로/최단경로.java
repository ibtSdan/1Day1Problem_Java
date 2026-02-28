import java.io.*;
import java.util.*;

public class Main {
    static BufferedWriter bw;

    static class Edge {
        int to, weight;
        Edge (int t, int w) {
            to = t;
            weight = w;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int start = Integer.parseInt(br.readLine());
        ArrayList<Edge>[] A = new ArrayList[n+1];
        for (int i = 1; i <= n; i++) {
            A[i] = new ArrayList<>();
        }
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            A[u].add(new Edge(v, w));
        }
        int[] dist = new int[n+1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[start] = 0;
        PriorityQueue<int[]> pq = new PriorityQueue<>( (a, b) -> { return a[0] - b[0];});
        pq.add(new int[] {dist[start], start});

        while (!pq.isEmpty()) {
            int[] now = pq.poll();
            int now_d = now[0], now_v = now[1];
            if (dist[now_v] < now_d) {
                continue;
            }
            for (Edge e : A[now_v]) {
                int t = e.to, w = e.weight;
                if (dist[t] > dist[now_v]+w) {
                    dist[t] = dist[now_v] + w;
                    pq.add(new int[] {dist[t], t});
                }
            }
        }

        for (int i = 1; i <= n; i++) {
            if (dist[i] == Integer.MAX_VALUE) {
                bw.write("INF\n");
            } else {
                bw.write(dist[i]+"\n");
            }
        }
        bw.flush();
    }
}
