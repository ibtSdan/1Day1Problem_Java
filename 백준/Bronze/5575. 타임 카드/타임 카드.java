import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int t = 0; t < 3; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] time1 = new int[3];
            int[] time2 = new int[3];
            for (int i = 0; i < 3; i++) {
                time1[i] = Integer.parseInt(st.nextToken());
            }
            for (int i = 0; i < 3; i++) {
                time2[i] = Integer.parseInt(st.nextToken());
            }
            boolean checkS = false;
            boolean checkM = false;
            int s = time2[2] - time1[2];
            if (s < 0) {
                checkS = true;
                s += 60;
            }
            int m = time2[1] - time1[1];
            if (checkS) {
                m--;
            }
            if (m < 0) {
                checkM = true;
                m += 60;
            }
            int h = time2[0] - time1[0];
            if (checkM) {
                h--;
            }
            bw.write(h+" "+m+" "+s+"\n");
        }
        bw.flush();
    }
}
