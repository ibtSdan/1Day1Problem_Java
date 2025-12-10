import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            if (name.equals("#")) {
                break;
            }
            int age = Integer.parseInt(st.nextToken());
            int we = Integer.parseInt(st.nextToken());
            if (age > 17 || we >=80) {
                bw.write(name+" Senior\n");
            } else {
                bw.write(name+" Junior\n");
            }
        }
        bw.flush();
    }
}
