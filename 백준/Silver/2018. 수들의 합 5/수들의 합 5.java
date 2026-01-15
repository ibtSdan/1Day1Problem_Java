import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int cnt = 1;
        int s = 1;
        int e = 1;
        int sum = 0;
        while (e <= n) {
            if (sum >= n) {
                if (sum == n) {
                    cnt += 1;
                }
                sum -= s;
                s++;
            } else {
                sum += e;
                e++;
            }
        }
        bw.write(cnt+"\n");
        bw.flush();
    }
}
