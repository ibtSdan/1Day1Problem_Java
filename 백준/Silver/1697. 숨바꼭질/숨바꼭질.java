import java.io.*;
import java.util.*;

public class Main {
    static BufferedWriter bw;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        Deque<int[]> dq = new ArrayDeque<>();
        dq.add(new int[] {n, 0});
        boolean[] visited = new boolean[100001];
        visited[n] = true;
        while (!dq.isEmpty()) {
            int[] now = dq.poll();
            if (now[0] == m) {
                bw.write(now[1]+"\n");
                break;
            }
            int[] arr = {now[0]+1, now[0]-1, now[0]*2};
            for (int i : arr) {
                if (i >= 0 && i <= 100000 && !visited[i]) {
                    dq.add(new int[] {i, now[1]+1});
                    visited[i] = true;
                }
            }
        }
        bw.flush();
    }
}
