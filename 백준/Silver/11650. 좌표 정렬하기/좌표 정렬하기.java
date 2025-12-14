import java.io.*;
import java.util.*;

class Dot {
    int x;
    int y;
    public Dot(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        ArrayList<Dot> dots = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            dots.add(new Dot(x,y));
        }

        Collections.sort(dots, (a, b) -> {
            if (a.x != b.x) {
                return a.x - b.x;
            }
            return a.y - b.y;
        });

        for (Dot d : dots) {
            bw.write(d.x +" "+d.y+"\n");
        }
        bw.flush();
    }
}
