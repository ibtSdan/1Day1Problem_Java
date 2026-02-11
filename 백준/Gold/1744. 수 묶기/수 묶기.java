import java.io.*;
import java.util.*;

public class Main {
    static BufferedWriter bw;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pos = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> non = new PriorityQueue<>();
        int one = 0;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());
            if (num > 1) {
                pos.add(num);
            } else if (num <= 0){
                non.add(num);
            } else {
                one++;
            }
        }

        int sum = 0;
        while (pos.size() > 1) {
            sum += pos.poll() * pos.poll();
        }
        if (!pos.isEmpty()) {
            sum += pos.poll();
        }

        while (non.size() > 1) {
            sum += non.poll() * non.poll();
        }
        if (!non.isEmpty()) {
            sum += non.poll();
        }

        bw.write(sum+one+"\n");
        bw.flush();
    }
}
