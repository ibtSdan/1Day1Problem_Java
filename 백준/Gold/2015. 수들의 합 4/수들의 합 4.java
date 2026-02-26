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

        Map<Integer, Integer> map = new HashMap<>();
        long ans = 0;
        map.put(0, 1);
        int[] S = new int[n];
        S[0] = A[0];
        if (S[0] == k) {
            ans++;
        }
        map.put(S[0], map.getOrDefault(S[0], 0)+1);

        for (int i = 1; i < n; i++) {
            S[i] = S[i-1] + A[i];
            int cnt = map.getOrDefault(S[i]-k, 0);
            ans += cnt;
            map.put(S[i], map.getOrDefault(S[i], 0) + 1);
        }
        bw.write(ans+"\n");
        bw.flush();
    }
}
