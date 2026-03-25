import java.io.*;
import java.util.*;

public class Main {
    static BufferedWriter bw;
    static String[] gears;
    static int[] dire;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        gears = new String[5];
        for (int i = 1; i <= 4; i++) {
            gears[i] = br.readLine();
        }
        int T = Integer.parseInt(br.readLine());
        dire = new int[5];
        for (int t = 0; t < T; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int gear = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            String[] temp = new String[5];
            temp[gear] = rotate(gear, d);
            dire[gear] = d;
            for (int i = gear+1; i < 5; i++) {
                if (gears[i-1].charAt(2) == gears[i].charAt(6)) {
                    break;
                }
                dire[i] = -dire[i-1];
                temp[i] = rotate(i, dire[i]);
            }
            for (int i = gear-1; i > 0; i--) {
                if (gears[i+1].charAt(6) == gears[i].charAt(2)) {
                    break;
                }
                dire[i] = -dire[i+1];
                temp[i] = rotate(i, dire[i]);
            }
            for (int i = 1; i < 5; i++) {
                if (temp[i] == null) {
                    temp[i] = gears[i];
                }
            }
            gears = temp;
        }
        int cnt = 0;
        if (gears[1].charAt(0) == '1') cnt = cnt + 1;
        if (gears[2].charAt(0) == '1') cnt = cnt + 2;
        if (gears[3].charAt(0) == '1') cnt = cnt + 4;
        if (gears[4].charAt(0) == '1') cnt = cnt + 8;
        bw.write(cnt+"\n");
        bw.flush();
    }

    static String rotate(int gear, int d) {
        if (d == 1) {
            return gears[gear].substring(7, 8) + gears[gear].substring(0, 7);
        } else {
            return gears[gear].substring(1, 8) + gears[gear].substring(0, 1);
        }
    }
}
