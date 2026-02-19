import java.io.*;
import java.util.*;

public class Main {
    static BufferedWriter bw;
    static int[] cnt;
    static ArrayList<Integer>[] A;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        A = new ArrayList[n+1];
        cnt = new int[n+1];
        for (int i = 1; i <= n; i++) {
            A[i] = new ArrayList<>();
        }
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            A[a].add(b);
        }

        for (int i = 1; i <= n; i++) {
            visited = new boolean[n+1];
            BFS(i);
        }

        ArrayList<Integer> ans = new ArrayList<>();
        int max = -1;
        for (int i = 1; i <= n; i++) {
            if (cnt[i] > max) {
                ans = new ArrayList<>();
                ans.add(i);
                max = cnt[i];
            } else if (cnt[i] == max) {
                ans.add(i);
            }
        }
        Collections.sort(ans);
        for (int i : ans) {
            bw.write(i+" ");
        }
        bw.flush();
    }

    static void BFS(int v) {
        Deque<Integer> dq = new ArrayDeque<>();
        dq.addLast(v);
        visited[v] = true;
        while (!dq.isEmpty()) {
            int now = dq.pollFirst();
            for (int i : A[now]) {
                if (!visited[i]) {
                    cnt[i]++;
                    visited[i] = true;
                    dq.addLast(i);
                }
            }
        }
    }
}
