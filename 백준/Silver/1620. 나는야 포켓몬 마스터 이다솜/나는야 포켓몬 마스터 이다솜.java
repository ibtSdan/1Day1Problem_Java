import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        String[] arr = new String[n+1];
        Map<String, Integer> map = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            String name = br.readLine();
            arr[i] = name;
            map.put(name, i);
        }

        for (int i = 0; i < m; i++) {
            String cmd = br.readLine();
            if (Character.isDigit(cmd.charAt(0))) {
                bw.write(arr[Integer.parseInt(cmd)]+"\n");
            } else {
                bw.write(map.get(cmd)+"\n");
            }
        }

        bw.flush();
    }
}
