import java.io.*;
import java.util.*;

public class Main {
    static BufferedWriter bw;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[][] D = new int[n+1][n+1];
        for (int i = 0; i <= n; i++) {
            D[i][0] = 1;
            D[i][1] = i;
            D[i][i] = 1;
        }
        for (int i = 3; i <= n; i++) {
            for (int j = 2; j < i; j++) {
                D[i][j] = D[i-1][j] + D[i-1][j-1];
            }
        }
        bw.write(D[n][k]+"\n");
        bw.flush();
    }
}
