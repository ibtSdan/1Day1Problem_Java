import java.io.*;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            int n = Integer.parseInt(br.readLine());
            set.add(n%42);
        }
        bw.write(set.size()+"\n");
        bw.flush();
    }
}
