import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int money = 0;

        if (a==b && b==c) {
            money = 10000 + a*1000;
        } else if (a != b && b != c && c != a) {
            int temp = Math.max(a, b);
            money = Math.max(temp, c)*100;
        } else {
            if (a == b || a == c) {
                money = 1000+a*100;
            } else {
                money = 1000+b*100;
            }
        }
        bw.write(money+"\n");
        bw.flush();
    }
}
