import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        if (n == 4) {
            bw.write("-1\n");
            bw.flush();
            return;
        }
        int[] list = new int[5001];
        Arrays.fill(list, 5000);
        list[3] = 1;
        list[5] = 1;
        for (int i = 6; i <= n; i++) {
            list[i] = Math.min(list[i-3], list[i-5]) + 1;
        }
        bw.write(list[n] == 5001 ? -1+"\n" : list[n]+"\n");
        bw.flush();
    }
}
