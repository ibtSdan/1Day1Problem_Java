import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int total = Integer.parseInt(br.readLine());
        int t = Integer.parseInt(br.readLine());

        int sum = 0;
        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int item = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());
            sum += item * n;
        }

        if (total == sum) {
            bw.write("Yes\n");
        } else {
            bw.write("No\n");
        }
        bw.flush();
    }
}
