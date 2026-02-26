import java.io.*;
import java.util.*;

public class Main {
    static BufferedWriter bw;

    static class Time {
        int start, end;
        Time(int s, int e) {
            start = s;
            end = e;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        List<Time> A = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            A.add(new Time(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
        }
        Collections.sort(A, (a,b) -> a.start - b.start);

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (Time t : A) {
            int s = t.start, e = t.end;

            if (!pq.isEmpty() && pq.peek() <= s) {
                pq.poll();
            }
            pq.add(e);
        }
        bw.write(pq.size()+"\n");
        bw.flush();
    }
}
