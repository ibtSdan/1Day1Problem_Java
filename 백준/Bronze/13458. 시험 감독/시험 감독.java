import java.io.*;
import java.util.*;

public class Main {
    static BufferedWriter bw;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        long cnt = 0;
        for (int i = 0; i < n; i++) {
            cnt++;
            arr[i] = Math.max(0, arr[i]-a);
            cnt += arr[i]/b;
            arr[i] = arr[i]%b;
            if (arr[i] != 0) {
                cnt++;
            }
        }
        bw.write(cnt+"\n");
        bw.flush();
    }
}
