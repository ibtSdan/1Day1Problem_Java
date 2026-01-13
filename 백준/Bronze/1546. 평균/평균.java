import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int sum = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            int temp = Integer.parseInt(st.nextToken());
            sum += temp;
            if (temp > max) {
                max = temp;
            }
        }

        double ans = (double) sum/max*100/n;
        bw.write(ans+"\n");
        bw.flush();
    }
}
