import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        Deque<Integer> dq = new ArrayDeque<>();
        for (int i = 0; i < T; i++) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) {
                dq.pollLast();
            } else {
                dq.addLast(n);
            }
        }

        int ans = 0;
        int size = dq.size();
        for (int i = 0; i < size; i++) {
            ans += dq.pollFirst();
        }
        bw.write(ans+"\n");
        bw.flush();
    }
}
