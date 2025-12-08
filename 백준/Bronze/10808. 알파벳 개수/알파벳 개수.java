import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();

        int[] data = new int[26];
        for (int i = 0; i < s.length(); i++) {
            data[(int) s.charAt(i) - 97]++;
        }

        for (int i = 0; i < 26; i++) {
            bw.write(data[i]+" ");
        }
        bw.flush();
    }
}
