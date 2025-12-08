import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String line = br.readLine();
            if (line.equals("#")) {
                break;
            }

            int count = 0;
            for (char c : line.toLowerCase().toCharArray()) {
                if ("aeiou".indexOf(c) != -1) {
                    count++;
                }
            }
            bw.write(count+"\n");
        }
        bw.flush();
    }
}
