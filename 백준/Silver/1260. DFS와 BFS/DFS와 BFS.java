import java.io.*;
import java.util.*;

public class Main {
    static BufferedWriter bw;
    static boolean[] visited;
    static ArrayList<Integer>[] A;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());

        A = new ArrayList[n+1];
        for (int i = 1; i <= n; i++) {
            A[i] = new ArrayList<>();
        }
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            A[a].add(b);
            A[b].add(a);
        }
        for (int i = 1; i <= n; i++) {
            Collections.sort(A[i]);
        }

        visited = new boolean[n+1];
        DFS(v);
        bw.write("\n");
        visited = new boolean[n+1];
        BFS(v);
        bw.flush();
    }

    static void DFS(int v) throws IOException {
        visited[v] = true;
        bw.write(v+" ");
        for (int i : A[v]) {
            if (!visited[i]) {
                DFS(i);
            }
        }
    }

    static void BFS(int v) throws IOException {
        Deque<Integer> dq = new ArrayDeque<>();
        visited[v] = true;
        dq.addLast(v);
        while (!dq.isEmpty()) {
            int now = dq.pollFirst();
            bw.write(now+" ");
            for (int i : A[now]) {
                if (!visited[i]) {
                    visited[i] = true;
                    dq.addLast(i);
                }
            }
        }
    }
}
