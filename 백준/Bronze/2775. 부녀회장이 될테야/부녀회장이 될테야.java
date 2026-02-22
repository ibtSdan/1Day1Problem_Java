import java.io.*;
import java.util.*;

public class Main {
    static BufferedWriter bw;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        for (int t = 0; t < T; t++) {
            int n = Integer.parseInt(br.readLine());
            int k = Integer.parseInt(br.readLine());
            int[][] D = new int[15][15];

            for (int i = 1; i < 15; i++) {
                D[0][i] = i;
                D[i][1] = 1;
            }

            for (int i = 1; i <= 14; i++) {
                for (int j = 2; j <= 14; j++) {
                    D[i][j] = D[i][j-1] + D[i-1][j];
                }
            }
            bw.write(D[n][k]+"\n");
        }
        bw.flush();
    }
}
