import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        List<Integer> data = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            data.add(Integer.parseInt(st.nextToken()));
        }
        int min = Collections.min(data);
        int max = Collections.max(data);

        bw.write(min+" "+max+"\n");
        bw.flush();
    }
}
