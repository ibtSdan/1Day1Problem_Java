import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());

        int a = 0;
        int b = 0;
        for (int i = 0; i < 4; i++) {
            a += Integer.parseInt(st1.nextToken());
            b += Integer.parseInt(st2.nextToken());
        }
        bw.write(Math.max(a, b)+"\n");
        bw.flush();
    }
}
