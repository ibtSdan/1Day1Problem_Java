import java.io.*;
import java.util.*;

public class Main {
    static BufferedWriter bw;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int f = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());
        int g = Integer.parseInt(st.nextToken());
        int u = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        Deque<int[]> dq = new ArrayDeque<>();
        boolean[] visited = new boolean[f+1];
        boolean check = false;
        dq.add(new int[] {s, 0});
        while (!dq.isEmpty()) {
            int[] now = dq.poll();
            if (now[0] == g) {
                check = true;
                bw.write(now[1]+"\n");
                break;
            }
            int[] arr = {now[0]+u, now[0]-d};
            for (int i : arr) {
                if (i >= 1 && i <= f && !visited[i]) {
                    dq.add(new int[] {i, now[1]+1});
                    visited[i] = true;
                }
            }
        }
        if (!check) {
            bw.write("use the stairs\n");
        }
        bw.flush();
    }
}
