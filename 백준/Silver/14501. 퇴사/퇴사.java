import java.io.*;
import java.util.*;

public class Main {
    static BufferedWriter bw;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] time = new int[n+1];
        int[] pay = new int[n+1];
        for (int i = 1; i <= n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            time[i] = Integer.parseInt(st.nextToken());
            pay[i] = Integer.parseInt(st.nextToken());
        }

        int[] d = new int[n+2];
        for (int i = n; i > 0; i--) {
            int consume_time = i + time[i];
            if (consume_time > n+1) {
                d[i] = d[i+1];
            } else {
                d[i] = Math.max(d[i+1], pay[i] + d[consume_time]);
            }
        }
        bw.write(d[1]+"\n");
        bw.flush();
    }
}
