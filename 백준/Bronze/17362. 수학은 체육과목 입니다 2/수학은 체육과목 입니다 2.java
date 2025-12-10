import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        int mod = n%8;
        if (mod == 1) {
            bw.write("1\n");
        } else if (mod == 2 || mod == 0) {
            bw.write("2\n");
        } else if (mod == 3 || mod == 7) {
            bw.write("3\n");
        } else if (mod == 4 || mod == 6) {
            bw.write("4\n");
        } else {
            bw.write("5\n");
        }
        bw.flush();
    }
}
