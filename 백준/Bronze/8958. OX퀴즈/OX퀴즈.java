import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        for (int t = 0; t < n; t++) {
            String line = br.readLine();
            int[] sum = new int[line.length()];
            int ans = 0;
            if (line.isEmpty()) {
                bw.write(0+"\n");
                continue;
            } else {
                sum[0] = line.charAt(0) == 'O' ? 1 : 0;
                ans = sum[0];
            }
            for (int i = 1; i < line.length(); i++) {
                char c = line.charAt(i);
                if (c == 'O') {
                    sum[i] = sum[i-1] + 1;
                } else {
                    sum[i] = 0;
                }
                ans += sum[i];
            }
            bw.write(ans+"\n");
        }
        bw.flush();
    }
}
