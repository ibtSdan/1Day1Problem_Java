import java.io.*;
import java.util.*;

public class Main {
    static BufferedWriter bw;
    static ArrayList<Integer>[] A;
    static boolean[] visited;
    static boolean arrive = false;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // 5개 연달아 있으면 true
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        A = new ArrayList[n];
        visited = new boolean[n];
        for (int i = 0; i < n; i++) {
            A[i] = new ArrayList<>();
        }
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            A[u].add(v);
            A[v].add(u);
        }
        for (int i = 0; i < n; i++) {
            if (arrive) {
                break;
            }
            DFS(i, 1);
        }

        if (arrive) {
            bw.write("1\n");
        } else {
            bw.write("0\n");
        }
        bw.flush();
    }
    static void DFS(int v, int k) {
        if (k == 5) {
            arrive = true;
            return;
        }
        visited[v] = true;
        for (int i : A[v]) {
            if (!visited[i]) {
                DFS(i, k + 1);
            }
        }
        visited[v] = false;
    }
}
