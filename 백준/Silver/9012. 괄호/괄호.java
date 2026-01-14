import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        for (int T = 0; T < n; T++) {
            String line = br.readLine();
            int count = 0;
            boolean check = true;
            for (char c : line.toCharArray()) {
                if (c == '(') {
                    count++;
                } else {
                    if (count > 0) {
                        count--;
                    } else {
                        check = false;
                        break;
                    }
                }
            }
            if (check && count == 0) {
                bw.write("YES\n");
            } else {
                bw.write("NO\n");
            }
        }
        bw.flush();
    }
}
