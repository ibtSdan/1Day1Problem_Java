import java.io.*;
import java.util.*;

public class Main {
    static BufferedWriter bw;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        final int MAX = 10000001;

        int n = Integer.parseInt(br.readLine());
        int[] A = new int[MAX];
        for (int i = 2; i < MAX; i++) {
            A[i] = i;
        }

        for (int i = 2; i <= Math.sqrt(MAX); i++) {
            if (A[i] == 0) {
                continue;
            }
            for (int j = i+i; j < MAX; j = j+i) {
                A[j] = 0;
            }
        }

        for (int i = n; i < MAX; i++) {
            if (A[i] != 0) {
                if (isPal(i)) {
                    bw.write(i+"\n");
                    break;
                }
            }
        }
        bw.flush();
    }

    static boolean isPal(int v) {
        char temp[] = String.valueOf(v).toCharArray();
        int s = 0;
        int e = temp.length - 1;
        while (s < e) {
            if (temp[s] != temp[e]) {
                return false;
            }
            s++;
            e--;
        }
        return true;
    }
}
