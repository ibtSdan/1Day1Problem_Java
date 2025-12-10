import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long a = Integer.parseInt(st.nextToken());
        long b = Integer.parseInt(st.nextToken());
        long chi = Integer.parseInt(br.readLine());
        if (a+b < chi*2) {
            bw.write(a+b+"\n");
        } else {
            bw.write(a+b-chi*2+"\n");
        }
        bw.flush();
    }
}
