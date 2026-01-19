import java.io.*;
import java.util.*;

public class Main {
    static int[] data;
    static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int num = 0;
        Deque<Integer> dq = new ArrayDeque<>();
        boolean check = true;
        List<Character> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int k = Integer.parseInt(br.readLine());
            while (num < k) {
                ans.add('+');
                num++;
                dq.addLast(num);
            }
            if (dq.peekLast() == k) {
                ans.add('-');
                dq.pollLast();
            } else {
                check = false;
                break;
            }
        }
        if (check) {
            for (char c : ans) {
                bw.write(c+"\n");
            }
        } else {
            bw.write("NO\n");
        }
        bw.flush();
    }
}
