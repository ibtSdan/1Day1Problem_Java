import java.io.*;
import java.util.*;

public class Main {
    static int N;
    static BufferedWriter bw;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        N = Integer.parseInt(br.readLine());
        // 2 3 5 7
        DFS(2, 1);
        DFS(3, 1);
        DFS(5, 1);
        DFS(7, 1);
        bw.flush();
    }

    static void DFS(int n, int k) throws IOException {
        if (k == N) {
            bw.write(n+"\n");
            return;
        }

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            if (isPrime(n * 10 + i)) {
                DFS(n*10+i, k+1);
            }
        }
    }

    static boolean isPrime(int n) {
        for (int i = 2; i <= Math.pow(n, 0.5)+1; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
