import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String line = br.readLine();
        int[] index = new int[26];
        Arrays.fill(index, -1);

        for (char c : line.toCharArray()) {
            int idx = c - 97;
            if (index[idx] == -1) {
                index[idx] = line.indexOf(c);
            }
        }
        for (int i = 0; i < 26; i++) {
            bw.write(index[i]+" ");
        }
        bw.flush();
    }
}
