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
        int[] D = new int[n+2];
        for (int i = n; i > 0; i--) {
            if (i + time[i] >= n+2) {
                D[i] = D[i+1];
            } else {
                D[i] = Math.max(D[i+time[i]] + pay[i], D[i+1]);
            }
        }
        bw.write(D[1]+"\n");
        bw.flush();
    }
}
