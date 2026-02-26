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
        int[] A = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        long sum = 0;
        int cnt = 0;
        int s = 0;
        int e = 0;
        long ans = Long.MAX_VALUE;

        while (e <= n) {
            if (sum >= k) {
                ans = Math.min(ans, cnt);
                sum -= A[s];
                s++;
                cnt--;
            } else if (e == n) {
                break;
            } else if (sum < k) {
                sum += A[e];
                e++;
                cnt++;
            }
        }
        if (ans == Long.MAX_VALUE) {
            ans = 0;
        }
        bw.write(ans+"\n");
        bw.flush();
    }
}
