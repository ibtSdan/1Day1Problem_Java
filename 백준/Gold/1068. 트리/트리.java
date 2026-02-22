import java.io.*;
import java.util.*;

public class Main {
    static BufferedWriter bw;
    static ArrayList<Integer>[] A;
    static boolean[] visited;
    static int delete;
    static int ans;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        A = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            A[i] = new ArrayList<>();
        }
        visited = new boolean[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        int root = 0;
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (num == -1) {
                root = i;
            } else {
                A[num].add(i);
            }
        }
        delete = Integer.parseInt(br.readLine());
        if (delete == root) {
            bw.write("0\n");
        } else {
            DFS(root);
            bw.write(ans+"\n");
        }
        bw.flush();
    }

    static void DFS(int v) {
        visited[v] = true;
        int cnt = 0;
        for (int i : A[v]) {
            if (!visited[i] && i != delete) {
                cnt++;
                DFS(i);
            }
        }
        if (cnt == 0) {
            ans++;
        }
    }
}
