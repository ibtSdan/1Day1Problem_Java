import java.io.*;
import java.util.*;

public class Main {
    static BufferedWriter bw;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        int[] A = new int[11];
        A[1] = 1;
        A[2] = 2;
        A[3] = 4;
        for (int i = 4; i < 11; i++) {
            A[i] = A[i-1] + A[i-2] + A[i-3];
        }
        for (int t = 0; t < T; t++) {
            int n = Integer.parseInt(br.readLine());
            bw.write(A[n]+"\n");
        }
        bw.flush();
    }
}
