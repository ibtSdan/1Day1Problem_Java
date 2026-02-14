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

        boolean[] visited = new boolean[100001];
        Deque<int[]> dq = new ArrayDeque<>();
        dq.add(new int[] {n, 0});
        visited[n] = true;

        while (!dq.isEmpty()) {
            int[] now = dq.pollFirst();
            if (now[0] == m) {
                bw.write(now[1]+"\n");
                break;
            }
            int[] range = {now[0]+1, now[0]-1, now[0]*2};
            for (int i : range) {
                if (i >= 0 && i <= 100000 && !visited[i]) {
                    visited[i] = true;
                    dq.add(new int[] {i, now[1]+1});
                }
            }
        }
        bw.flush();
    }
}
