import java.io.*;
import java.util.*;

public class Main {
    static BufferedWriter bw;
    static int[][] A;
    static int n, min = Integer.MAX_VALUE;
    static boolean[] selected;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        n = Integer.parseInt(br.readLine());
        A = new int[n][n];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                A[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        selected = new boolean[n];

        dfs(0, 0);
        System.out.println(min);
    }

    static void dfs(int idx, int count) {
        if (count == n/2) {
            cal();
            return;
        }
        for (int i = idx; i < n; i++) {
            if (!selected[i]) {
                selected[i] = true;
                dfs(i+1, count+1);
                selected[i] = false;
            }
        }
    }

    static void cal() {
        int a = 0, b = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (selected[i] && selected[j]) {
                    a += A[i][j] + A[j][i];
                } else if (!selected[i] && !selected[j]) {
                    b += A[i][j] + A[j][i];
                }
            }
        }
        min = Math.min(min, Math.abs(a-b));
    }
}
