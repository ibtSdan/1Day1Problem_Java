import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int hour = Integer.parseInt(st.nextToken());
        int min = Integer.parseInt(st.nextToken());
        int sec = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(br.readLine());

        sec += n;
        if (sec > 59) {
            min += sec/60;
            sec %= 60;
        }
        if (min > 59) {
            hour += min/60;
            min %= 60;
        }
        if (hour > 23) {
            hour %= 24;
        }

        bw.write(hour +" " + min+" "+sec);
        bw.flush();
    }
}
