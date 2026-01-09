import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String line = br.readLine();

        int[] data = new int[26];
        Arrays.fill(data, -1);
        for (int i = 0; i < line.length(); i++) {
            int idx = line.charAt(i) - 'a';
            if (data[idx] == -1) {
                data[idx] = i;
            }
        }
        for (int i = 0; i < 26; i++) {
            bw.write(data[i]+" ");
        }
        bw.write("\n");
        bw.flush();
    }
}
