import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String line = br.readLine();
            if (line.equals(".")) {
                break;
            }
            ArrayDeque<Character> dq = new ArrayDeque<>();
            boolean check = true;

            for (char c : line.toCharArray()) {
                if (c == '(' || c == '[') {
                    dq.push(c);
                } else if (c == ')') {
                    if (dq.isEmpty() || dq.peek() != '(') {
                        bw.write("no\n");
                        check = false;
                        break;
                    }
                    dq.pop();
                } else if (c == ']') {
                    if (dq.isEmpty() || dq.peek() != '[') {
                        bw.write("no\n");
                        check = false;
                        break;
                    }
                    dq.pop();
                }
            }
            if (check && dq.isEmpty()) {
                bw.write("yes\n");
            } else if (check) {
                bw.write("no\n");
            }
        }
        bw.flush();
    }
}
