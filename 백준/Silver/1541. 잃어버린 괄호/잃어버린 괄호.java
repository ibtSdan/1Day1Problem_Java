import java.io.*;
import java.util.*;

public class Main {
    static BufferedWriter bw;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String line = br.readLine();
        String[] data = line.split("-");
        int sum = 0;
        for (int i = 0; i < data.length; i++) {
            int temp = 0;
            String[] num = data[i].split("\\+");
            for (int j = 0; j < num.length; j++) {
                temp += Integer.parseInt(num[j]);
            }
            if (i == 0) {
                sum += temp;
            } else {
                sum -= temp;
            }
        }
        bw.write(sum+"\n");
        bw.flush();
    }
}
