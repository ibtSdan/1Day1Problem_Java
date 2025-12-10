import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String line = br.readLine();
        int[] kda = Arrays.stream(line.split("/"))
                .mapToInt(Integer::parseInt)
                .toArray();

        if (kda[0]+kda[2]<kda[1] || kda[1]==0) {
            bw.write("hasu\n");
        } else {
            bw.write("gosu\n");
        }
        bw.flush();
    }
}
