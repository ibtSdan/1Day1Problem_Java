import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int max = 0;
        int idx = 0;
        for (int t = 1; t <= 9; t++) {
            int num = Integer.parseInt(br.readLine());
            if (num > max) {
                max = num;
                idx = t;
            }
        }
        bw.write(max+"\n");
        bw.write(idx+"\n");
        bw.flush();
    }
}
