import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            String cmd = br.readLine();
            if (cmd.startsWith("push")) {
                int x = Integer.parseInt(cmd.split(" ")[1]);
                stack.push(x);
            } else if (cmd.equals("pop")) {
                bw.write(stack.isEmpty() ? -1+"\n" : stack.pop()+"\n");
            } else if (cmd.equals("size")) {
                bw.write(stack.size()+"\n");
            } else if (cmd.equals("empty")) {
                bw.write(stack.isEmpty() ? 1+"\n" : 0+"\n");
            } else {
                bw.write(stack.isEmpty() ? -1+"\n" : stack.peek()+"\n");
            }
        }
        bw.flush();
    }
}
