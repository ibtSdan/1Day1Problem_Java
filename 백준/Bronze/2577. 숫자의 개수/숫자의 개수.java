import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        String line = ""+(a*b*c);

        int[] count = new int[10];
        for (char ch : line.toCharArray()) {
            count[ch - '0']++;
        }
        for (int i : count) {
            bw.write(i+"\n");
        }
        bw.flush();
    }
}
