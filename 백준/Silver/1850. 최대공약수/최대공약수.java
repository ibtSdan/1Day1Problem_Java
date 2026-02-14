import java.io.*;
import java.util.*;

public class Main {
    static BufferedWriter bw;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());

        int result = gcd(a,b);
        String ans = "1".repeat(result);
        bw.write(ans+"\n");
        bw.flush();
    }

    static int gcd(Long a, Long b) {
        if (b == 0) {
            return Integer.parseInt(String.valueOf(a));
        }
        return gcd(b, a%b);
    }
}
