import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int cnt = 0;
        int now = 665;

        while (true) {
            now++;
            if (String.valueOf(now).contains("666")) {
                cnt++;
            }
            if (cnt == n) {
                bw.write(now+"\n");
                break;
            }
        }
        bw.flush();
    }
}
