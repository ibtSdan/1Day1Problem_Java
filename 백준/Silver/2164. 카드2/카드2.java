import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Deque<Integer> dq = new ArrayDeque<>();
        int n = Integer.parseInt(br.readLine());
        for (int i = 1; i <= n; i++) {
            dq.addLast(i);
        }
        while (dq.size() > 1) {
            dq.pollFirst();
            dq.addLast(dq.pollFirst());
        }
        bw.write(dq.peekFirst()+"\n");
        bw.flush();
    }
}
