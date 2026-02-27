import java.io.*;
import java.util.*;

public class Main {
    static BufferedWriter bw;
    static class Edge {
        int to, weight;
        Edge(int t, int w) {
            to = t;
            weight = w;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        ArrayList<Edge>[] A = new ArrayList[n+1];
        for (int i = 1; i <= n; i++) {
            A[i] = new ArrayList<>();
        }
        int[] d = new int[n+1];
        Arrays.fill(d, Integer.MAX_VALUE);
        for (int i = 0; i < m; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            A[u].add(new Edge(v, w));
        }
        StringTokenizer st = new StringTokenizer(br.readLine());
        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());
        d[start] = 0;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> { return a[0] - b[0];});
        pq.add(new int[] {0, start});
        while (!pq.isEmpty()) {
            int[] now = pq.poll();
            int now_d = now[0], now_v = now[1];
            if (now_d > d[now_v]) {
                continue;
            }
            for (Edge e : A[now_v]) {
                int to = e.to, weight = e.weight;
                if (d[to] > now_d+weight) {
                    d[to] = now_d + weight;
                    pq.add(new int[] {d[to], to});
                }
            }
        }
        bw.write(d[end]+"\n");
        bw.flush();
    }
}
