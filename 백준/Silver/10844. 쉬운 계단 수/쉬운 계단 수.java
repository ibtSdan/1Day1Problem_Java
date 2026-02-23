import java.io.*;
import java.util.*;

public class Main {
    static BufferedWriter bw;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        long[][] d = new long[n+1][10];

        for (int i = 1; i<= 9; i++) {
            d[1][i] = 1;
        }

        for (int i = 2; i <= n; i++) {
            d[i][0] = d[i-1][1]%1000000000; // 앞이 1인 경우
            d[i][9] = d[i-1][8]%1000000000; // 앞이 8인 경우
            for (int j = 1; j <= 8; j++) {
                d[i][j] = (d[i-1][j-1] + d[i-1][j+1])%1000000000;
            }
        }

        long ans = 0;
        for (int i = 0; i <= 9; i++) {
            ans += d[n][i];
        }
        ans %= 1000000000;
        bw.write(ans+"\n");
        bw.flush();
    }
}
