import java.io.*;
import java.util.*;

public class Main {
    static BufferedWriter bw;
    static int[] cnt;
    static ArrayList<Integer>[] A;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] A = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        int ans = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            int idx = i;
            while (idx < n) {
                sum += A[idx];
                if (sum >= m) {
                    if (sum == m) {
                        ans++;
                    }
                    break;
                }
                idx++;
            }
        }
        bw.write(ans+"\n");
        bw.flush();
    }
}
