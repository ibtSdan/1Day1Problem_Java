import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String line = br.readLine();
        int[] A = new int[line.length()];
        for (int i = 0; i < line.length(); i++) {
            A[i] = Integer.parseInt(line.substring(i, i+1));
        }
        Arrays.sort(A);
        for (int i = line.length()-1; i >= 0; i--) {
            bw.write(A[i]+"");
        }
        bw.flush();
    }
}
