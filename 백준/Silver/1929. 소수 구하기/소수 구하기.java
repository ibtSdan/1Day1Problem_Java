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

        int[] A = new int[m+1];
        for (int i = 2; i <= m; i++) {
            A[i] = i;
        }

        for (int i = 2; i <= Math.sqrt(m); i++) {
            if (A[i] == 0) {
                continue;
            }
            for (int j = i+i; j <= m; j = j+i) {
                A[j] = 0;
            }
        }

        for (int i = n; i <= m; i++) {
            if (A[i] != 0) {
                bw.write(A[i]+"\n");
            }
        }
        bw.flush();
    }
}
