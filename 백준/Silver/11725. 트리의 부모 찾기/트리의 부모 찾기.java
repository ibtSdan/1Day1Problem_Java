import java.io.*;
import java.util.*;

public class Main {
    static BufferedWriter bw;

    static ArrayList<Integer>[] A;
    static boolean[] visited;
    static int[] ans;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        A = new ArrayList[n+1];
        visited = new boolean[n+1];
        ans = new int[n+1];
        for (int i = 1; i <= n; i++) {
            A[i] = new ArrayList<>();
        }
        for (int i = 0; i < n-1; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            A[a].add(b);
            A[b].add(a);
        }
        DFS(1);
        for (int i = 2; i <= n; i++) {
            bw.write(ans[i]+"\n");
        }
        bw.flush();
    }

    static void DFS(int v) {
        visited[v] = true;
        for (int i : A[v]) {
            if (!visited[i]) {
                ans[i] = v;
                DFS(i);
            }
        }
    }
}
