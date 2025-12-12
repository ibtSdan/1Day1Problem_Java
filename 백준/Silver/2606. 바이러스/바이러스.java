import java.io.*;
import java.util.*;

public class Main {
    static boolean[] visited;
    static ArrayList<Integer>[] graph;
    static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

         visited = new boolean[n+1];
         graph = new ArrayList[n+1];
         for (int i = 1; i <= n; i++) {
             graph[i] = new ArrayList<>();
         }
         for (int i = 0; i < m; i++) {
             StringTokenizer st = new StringTokenizer(br.readLine());
             int a = Integer.parseInt(st.nextToken());
             int b = Integer.parseInt(st.nextToken());
             graph[a].add(b);
             graph[b].add(a);
         }

         dfs(1);
         bw.write(count-1+"\n");
         bw.flush();
    }

    static void dfs(int x) {
        visited[x] = true;
        count++;
        for (int next : graph[x]) {
            if (!visited[next]) {
                dfs(next);
            }
        }
    }
}
