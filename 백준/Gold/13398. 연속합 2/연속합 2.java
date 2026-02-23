import java.io.*;
import java.util.*;

public class Main {
    static BufferedWriter bw;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] A = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        long[][] dp = new long[n][2];
        if (n == 1) {
            bw.write(A[0]+"\n");
            bw.flush();
            return;
        }
        dp[0][0] = A[0];
        dp[1][0] = Math.max(A[1], A[0]+A[1]);
        dp[1][1] = Math.max(A[0], A[1]);

        for (int i = 2; i < n; i++) {
            dp[i][0] = Math.max(dp[i-1][0]+A[i], A[i]);
            dp[i][1] = Math.max(dp[i-1][0], dp[i-1][1]+A[i]);
        }

        long ans = Math.max(dp[1][0], dp[1][1]);
        ans = Math.max(A[0], ans);
        for (int i = 2; i < n; i++) {
            long temp = Math.max(dp[i][0], dp[i][1]);
            ans = Math.max(ans,temp);
        }
        bw.write(ans+"\n");
        bw.flush();
    }
}
