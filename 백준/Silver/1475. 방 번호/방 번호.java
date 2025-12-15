import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String line = br.readLine();
        int[] arr = new int[10];
        for (char c : line.toCharArray()) {
            arr[c-'0']++;
        }

        int max = (arr[6]+arr[9]+1)/2;
        
        for (int i = 0; i < 10; i++) {
            if (i == 6 || i == 9) continue;
            max = Math.max(max, arr[i]);
        }
        
        bw.write(max+"\n");
        bw.flush();
    }
}
