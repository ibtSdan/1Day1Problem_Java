import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            String word = br.readLine();
            boolean check = true;
            for (int s = 0; s < word.length()-1; s++) {
                if (word.charAt(s) == word.charAt(s+1)) {
                    continue;
                } else if (word.substring(s+1).indexOf(word.charAt(s)) != -1) {
                    check = false;
                    break;
                }
            }
            if (check) {
                cnt++;
            }
        }
        bw.write(cnt+"\n");
        bw.flush();
    }
}
