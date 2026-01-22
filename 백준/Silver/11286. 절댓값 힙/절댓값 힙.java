import java.io.*;
import java.util.*;

class Num {
    int val;
    int abs;
    Num(int v) {
        this.val = v;
        this.abs = Math.abs(v);
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        PriorityQueue<Num> pq = new PriorityQueue<>(
                (a, b) -> {
                    if (a.abs == b.abs) {
                        return a.val - b.val;
                    }
                    return a.abs - b.abs;
                }
        );

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());
            if (num != 0) {
                pq.add(new Num(num));
            } else {
                if (pq.isEmpty()) {
                    bw.write("0\n");
                } else {
                    Num temp = pq.poll();
                    bw.write(temp.val+"\n");
                }
            }
        }
        bw.flush();
    }
}
