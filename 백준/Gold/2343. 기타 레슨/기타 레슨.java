import java.io.*;
import java.util.*;

public class Main {
    static BufferedWriter bw;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] A = new int[n];
        int s = 0;
        int e = 0;
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            A[i] = Integer.parseInt(st.nextToken());
            if (A[i] > s) {
                s = A[i];
            }
            e += A[i];
        }

        while (s <= e) {
            int mid = (s+e)/2;
            int sum = 0;
            int cnt = 1;
            for (int i = 0; i < n; i++){
                if (sum + A[i] > mid) {
                    cnt++;
                    sum = 0;
                }
                sum += A[i];
            }
            if (cnt > m) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }

        bw.write(s+"\n");
        bw.flush();
    }
}
