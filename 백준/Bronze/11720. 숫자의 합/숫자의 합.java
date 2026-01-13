import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        String line = br.readLine();

        long ans = 0;
        for (char c : line.toCharArray()) {
            ans += c - '0';
        }
        bw.write(ans+"\n");
        bw.flush();
    }
}
