import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int b = 2000;
        for (int i = 0; i < 3; i++) {
            int temp = Integer.parseInt(br.readLine());
            if (temp < b) {
                b = temp;
            }
        }

        int d = 2000;
        for (int i = 0; i < 2; i++) {
            int temp = Integer.parseInt(br.readLine());
            if (temp < d) {
                d = temp;
            }
        }
        bw.write(b+d-50+"\n");
        bw.flush();
    }
}
