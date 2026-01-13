import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        for (int test = 0; test < n; test++) {
            String line = br.readLine();
            int ans = 0;
            int score = 0;
            for (char c : line.toCharArray()) {
                if (c == 'O') {
                    score++;
                } else {
                    score = 0;
                }
                ans += score;
            }
            bw.write(ans+"\n");
        }
        bw.flush();
    }
}
