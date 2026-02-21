import java.io.*;
import java.util.*;

public class Main {
    static BufferedWriter bw;

    static class Edge {
        int to, weight;
        Edge (int to, int weight) {
            this.to = to;
            this.weight = weight;
        }
    }

    static final int INF = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        ArrayList<Edge>[] graph = new ArrayList[N+1];
        for (int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int i = 0; i < M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            graph[u].add(new Edge(v, w));
        }
        StringTokenizer st = new StringTokenizer(br.readLine());
        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());

        int[] dist = new int[N+1];
        Arrays.fill(dist, INF);
        dist[start] = 0;

        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        pq.add(new int[] {0, start});
        while (!pq.isEmpty()) {
            int[] now = pq.poll();
            int now_d = now[0], now_v = now[1];
            if (dist[now_v] < now_d) continue;
            for (Edge e : graph[now_v]) {
                int next_v = e.to, w = e.weight;
                if (dist[next_v] > dist[now_v] + w) {
                    dist[next_v] = dist[now_v] + w;
                    pq.add(new int[] {dist[next_v], next_v});
                }
            }
        }

        bw.write(dist[end]+"\n");
        bw.flush();
    }
}
