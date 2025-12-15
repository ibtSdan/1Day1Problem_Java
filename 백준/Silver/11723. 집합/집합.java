import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int s = 0;

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String cmd = st.nextToken();

            if (cmd.equals("add")) {
                int x = Integer.parseInt(st.nextToken());
                s |= (1 << x);
            } else if (cmd.equals("remove")) {
                int x = Integer.parseInt(st.nextToken());
                s &= ~(1 << x);
            } else if (cmd.equals("check")) {
                int x = Integer.parseInt(st.nextToken());
                bw.write((s & (1 << x)) != 0 ? "1\n" : "0\n");
            } else if (cmd.equals("toggle")) {
                int x = Integer.parseInt(st.nextToken());
                s ^= (1 << x);
            } else if (cmd.equals("all")) {
                s = (1 << 21) - 1;
            } else if (cmd.equals("empty")) {
                s = 0;
            }
        }
        bw.flush();
    }
}
