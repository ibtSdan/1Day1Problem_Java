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
        Arrays.sort(A);
        int[] S = new int[n];
        S[0] = A[0];
        for (int i = 1; i < n; i++) {
            S[i] = S[i-1] + A[i];
        }
        int ans = 0;
        for (int i : S) {
            ans += i;
        }
        bw.write(ans+"\n");
        bw.flush();
    }
}
