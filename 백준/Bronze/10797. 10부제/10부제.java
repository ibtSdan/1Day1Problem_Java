import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int count = 0;
        for (int i = 0; i < 5; i++) {
            int temp = Integer.parseInt(st.nextToken());
            if (temp == n) {
                count++;
            }
        }
        bw.write(count+"\n");
        bw.flush();
    }
}
