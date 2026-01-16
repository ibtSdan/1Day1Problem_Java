import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] data = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            data[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(data);

        int cnt = 0;
        for (int k = 0; k < n; k++) {
            int s = 0;
            int e = n-1;
            while (s < e) {
                if (data[s] + data[e] == data[k]) {
                    if (s == k) {
                        s++;
                    } else if (e == k) {
                        e--;
                    } else {
                        cnt++;
                        break;
                    }
                } else if (data[s] + data[e] > data[k]) {
                    e--;
                } else {
                    s++;
                }
            }
        }
        bw.write(cnt+"\n");
        bw.flush();
    }
}
