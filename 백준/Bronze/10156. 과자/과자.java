import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int need = Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken());
        int ans = need - Integer.parseInt(st.nextToken());
        if (ans < 0) {
            ans = 0;
        }
        bw.write(ans+"\n");
        bw.flush();
    }
}
