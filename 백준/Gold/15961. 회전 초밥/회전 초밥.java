import java.io.*;
import java.util.*;

public class Main {
    static BufferedWriter bw;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int[] A = new int[N+k-1];
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(br.readLine());
        }
        for (int i = N; i < N+k-1; i++) {
            A[i] = A[i-N];
        }

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < k; i++) {
            map.put(A[i], map.getOrDefault(A[i], 0)+1);
        }
        int cnt = map.size();
        if (!map.containsKey(c)) {
            cnt++;
        }
        int ans = cnt;

        int s = 0, e = k;
        while (e < N+k-1) {
            map.put(A[e], map.getOrDefault(A[e], 0) + 1);
            map.put(A[s], map.get(A[s])-1);
            if (map.get(A[s]) == 0) {
                map.remove(A[s]);
            }
            cnt = map.size();
            if (!map.containsKey(c)) {
                cnt++;
            }
            ans = Math.max(ans, cnt);
            s++;
            e++;
        }
        bw.write(ans+"\n");
        bw.flush();
    }
}
