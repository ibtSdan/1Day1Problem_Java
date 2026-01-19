import java.io.*;
import java.util.*;

public class Main {
    static int[] data;
    static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        Deque<Integer> dq = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            String cmd = br.readLine();
            if (cmd.startsWith("push_front")) {
                dq.addFirst(Integer.parseInt(cmd.split(" ")[1]));
            } else if (cmd.startsWith("push_back")) {
                dq.addLast(Integer.parseInt(cmd.split(" ")[1]));
            } else if (cmd.equals("pop_front")) {
                if (dq.isEmpty()) {
                    bw.write("-1\n");
                } else {
                    bw.write(dq.pollFirst()+"\n");
                }
            } else if (cmd.equals("pop_back")) {
                if (dq.isEmpty()) {
                    bw.write("-1\n");
                } else {
                    bw.write(dq.pollLast()+"\n");
                }
            } else if (cmd.equals("size")) {
                bw.write(dq.size()+"\n");
            } else if (cmd.equals("empty")) {
                if (dq.isEmpty()) {
                    bw.write("1\n");
                } else {
                    bw.write("0\n");
                }
            } else if (cmd.equals("front")) {
                if (dq.isEmpty()) {
                    bw.write("-1\n");
                } else {
                    bw.write(dq.peekFirst()+"\n");
                }
            } else {
                if (dq.isEmpty()) {
                    bw.write("-1\n");
                } else {
                    bw.write(dq.peekLast()+"\n");
                }
            }
        }
        bw.flush();
    }
}
