import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int s = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
        if (s+k+h >= 100) {
            bw.write("OK\n");
        } else {
            int min = Math.min(s, Math.min(k, h));
            if (min == s) {
                bw.write("Soongsil\n");
            } else if (min == k) {
                bw.write("Korea\n");
            } else {
                bw.write("Hanyang\n");
            }
        }
        bw.flush();
    }
}
