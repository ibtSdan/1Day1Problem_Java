import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        bw.write("<");
        Queue<Integer> q = new ArrayDeque<>();
        for (int i = 1; i <= n; i++) {
            q.offer(i);
        }
        while (q.size() > 1) {
            for (int i = 0; i < k-1; i++) {
                q.offer(q.poll());
            }
            bw.write(q.poll()+", ");
        }
        bw.write(q.poll()+">");

        bw.flush();
    }
}
