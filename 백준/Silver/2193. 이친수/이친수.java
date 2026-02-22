import java.io.*;
import java.util.*;

public class Main {
    static BufferedWriter bw;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        long[][] D = new long[n+1][2];

        D[1][1] = 1;

        for (int i = 2; i <= n; i++) {
            D[i][0] = D[i-1][0] + D[i-1][1];
            D[i][1] = D[i-1][0];
        }
        bw.write(D[n][0] + D[n][1] + "\n");
        bw.flush();
    }
}
