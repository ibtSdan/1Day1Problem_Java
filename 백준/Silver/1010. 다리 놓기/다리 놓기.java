import java.io.*;
import java.util.*;

public class Main {
    static BufferedWriter bw;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        for (int t = 0; t < T; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int k = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());
            int[][] D = new int[n+1][n+1];
            for (int i = 1; i <= n; i++) {
                D[i][1] = i;
                D[i][i] = 1;
                D[i][0] = 1;
            }

            for (int i = 2; i <= n; i++) {
                for (int j = 1; j < i; j++) {
                    D[i][j] = D[i-1][j] + D[i-1][j-1];
                }
            }
            bw.write(D[n][k]+"\n");
        }
        bw.flush();
    }
}
