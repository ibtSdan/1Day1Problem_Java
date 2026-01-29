import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] data = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            data[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(data);
        int[] S = new int[n];
        S[0] = data[0];
        int ans = S[0];

        for (int i = 1; i < n; i++) {
            S[i] = S[i-1] + data[i];
            ans += S[i];
        }
        bw.write(ans+"\n");
        bw.flush();
    }
}
