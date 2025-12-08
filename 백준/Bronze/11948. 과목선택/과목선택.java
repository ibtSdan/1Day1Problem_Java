import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] science = new int[4];
        int[] social = new int[2];

        for(int i = 0; i < 4; i++) {
            science[i] = Integer.parseInt(br.readLine());
        }
        for (int i = 0; i < 2; i++) {
            social[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(science);
        int max = science[1] + science[2] + science[3];
        bw.write((max+Math.max(social[0],social[1]))+"\n");
        bw.flush();
    }
}
