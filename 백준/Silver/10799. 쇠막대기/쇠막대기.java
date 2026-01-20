import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char[] line = br.readLine().toCharArray();
        int cnt = 0;
        int ans = 0;
        int i = 0;
        while (i < line.length - 1) {
            if (line[i] == '(' && line [i+1] == ')') {
                ans += cnt;
                i += 2;
            } else if (line[i] == '(') {
                cnt++;
                i++;
            } else if (line[i] == ')') {
                ans++;
                cnt--;
                i++;
            }
        }

        if (i == line.length - 1) {
            ans++;
        }
        bw.write(ans+"\n");
        bw.flush();
    }
}
