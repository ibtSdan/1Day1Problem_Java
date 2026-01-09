import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String line = br.readLine().toUpperCase();
        int[] data = new int[26];
        for (char c : line.toCharArray()) {
            data[c - 'A']++;
        }

        int max = -1;
        char ans = '?';
        for (int i = 0; i < 26; i++) {
            if (data[i] > max) {
                max = data[i];
                ans = (char) (i + 'A');
            } else if (data[i] == max) {
                ans = '?';
            }
        }

        bw.write(ans+"\n");
        bw.flush();
    }
}
