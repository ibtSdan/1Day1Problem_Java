import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int m = Integer.parseInt(br.readLine());
        int d = Integer.parseInt(br.readLine());

        if (m == 2) {
            if (d == 18) {
                bw.write("Special\n");
            } else {
                bw.write(d < 18 ? "Before\n" : "After");
            }
        } else if (m > 2) {
            bw.write("After\n");
        } else {
            bw.write("Before\n");
        }
        bw.flush();
    }
}
