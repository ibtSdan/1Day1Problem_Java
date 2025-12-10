import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int sum = Integer.parseInt(st.nextToken());
        int dif = Integer.parseInt(st.nextToken());

        double a = (sum+dif)/2.0;
        double b = sum - a;

        if (a%1 != 0 || b%1 != 0 || a < 0 || b < 0) {
            bw.write("-1\n");
        } else {
            bw.write((int)Math.max(a, b)+" "+(int)Math.min(a, b)+"\n");
        }
        bw.flush();
    }
}
