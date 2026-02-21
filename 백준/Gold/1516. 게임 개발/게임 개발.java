import java.io.*;
import java.util.*;

public class Main {
    static BufferedWriter bw;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer>[] A = new ArrayList[n+1];
        int[] D = new int[n+1];
        int[] time = new int[n+1];
        int[] ans = new int[n+1];
        for (int i = 1; i <= n; i++) {
            A[i] = new ArrayList<>();
        }
        for (int i = 1; i <= n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            time[i] = Integer.parseInt(st.nextToken());
            while (true) {
                int temp = Integer.parseInt(st.nextToken());
                if (temp == -1) {
                    break;
                }
                A[temp].add(i);
                D[i]++;
            }
        }

        Deque<Integer> dq = new ArrayDeque<>();
        for (int i = 1; i <= n; i++) {
            if (D[i] == 0) {
                dq.addLast(i);
            }
        }
        while (!dq.isEmpty()) {
            int now = dq.pollFirst();
            for (int i : A[now]) {
                D[i]--;
                ans[i] = Math.max(ans[i], ans[now]+time[now]);
                if (D[i] == 0) {
                    dq.addLast(i);
                }
            }
        }

        for (int i = 1; i <= n; i++) {
            ans[i] += time[i];
            bw.write(ans[i]+"\n");
        }
        bw.flush();
    }
}
