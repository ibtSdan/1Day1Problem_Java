import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int[] sum = new int[n+1];
        for (int i = 1; i <= n; i++) {
            int num = Integer.parseInt(st2.nextToken());
            sum[i] = num + sum[i-1];
        }
        for (int i = 0; i < m; i++) {
            StringTokenizer st3 = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st3.nextToken());
            int b = Integer.parseInt(st3.nextToken());
            bw.write(sum[b] - sum[a-1]+"\n");
        }
        bw.flush();
    }
}
