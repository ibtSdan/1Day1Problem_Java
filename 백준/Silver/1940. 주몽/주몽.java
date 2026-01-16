import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        int[] data = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            data[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(data);

        int cnt = 0;
        int s = 0;
        int e = n-1;
        while (s < e) {
            int temp = data[s] + data[e];
            if (temp == m) {
                cnt++;
                s++;
                e--;
            } else if (temp < m) {
                s++;
            } else {
                e--;
            }
        }
        bw.write(cnt+"\n");
        bw.flush();
    }
}
