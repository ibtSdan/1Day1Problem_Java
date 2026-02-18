import java.io.*;
import java.util.*;

public class Main {
    static BufferedWriter bw;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());

        int[] length = new int[N+1];
        ArrayList<Integer>[] A = new ArrayList[N+1];
        for (int i = 1; i < N+1; i++) {
            length[i] = -1;
        }
        
        for (int i = 1; i < N+1; i++) {
            A[i] = new ArrayList<>();
        }
        Deque<Integer> dq = new ArrayDeque<>();

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            A[u].add(v);
        }

        dq.add(X);
        length[X]++;

        while (!dq.isEmpty()) {
            int now = dq.pollFirst();
            for (int i : A[now]) {
                if (length[i] == -1) {
                    length[i] = length[now] + 1;
                    dq.addLast(i);
                }
            }
        }

        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 1; i < N+1; i++) {
            if (length[i] == K) {
                ans.add(i);
            }
        }
        if (ans.isEmpty()) {
            ans.add(-1);
        }
        Collections.sort(ans);
        for (int i : ans) {
            bw.write(i+"\n");
        }
        bw.flush();
    }
}
