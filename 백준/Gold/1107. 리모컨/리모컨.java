import java.io.*;
import java.util.*;

public class Main {
    static BufferedWriter bw;
    static int[] x;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        x = new int[m];
        if (m > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < m; i++) {
                x[i] = Integer.parseInt(st.nextToken());
            }
        }

        int ans = Math.abs(n - 100);
        for (int i = 0; i <= 999999; i++) {
            if (canMake(i)) {
                int cnt = Math.abs(n - i) + length(i);
                ans = Math.min(ans, cnt);
            }
        }
        bw.write(ans+"\n");
        bw.flush();
    }

    static int length(int v) {
        String temp = String.valueOf(v);
        return temp.length();
    }

    static boolean canMake(int v) {
        String temp = String.valueOf(v);
        for (int i = 0; i < temp.length(); i++) {
            int num = Integer.parseInt(temp.substring(i, i+1));
            for (int j : x) {
                if (num == j) {
                    return false;
                }
            }
        }
        return true;
    }
}
