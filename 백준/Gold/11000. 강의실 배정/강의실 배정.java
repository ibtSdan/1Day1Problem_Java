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
        PriorityQueue<Time> A = new PriorityQueue<>( (a, b) -> {
           if (a.start != b.start) {
               return a.start - b.start;
           }
           return a.end - b.end;
        });
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            Time t = new Time(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
            A.add(t);
        }

        PriorityQueue<Integer> pq = new PriorityQueue();
        while (!A.isEmpty()) {
            Time now = A.poll();
            int s = now.start, e = now.end;
            if (!pq.isEmpty() && pq.peek() <= s) {
                pq.poll();
            }
            pq.add(e);
        }
        bw.write(pq.size()+"\n");
        bw.flush();
    }
}
