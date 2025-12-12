import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;
        
        for (int i = 1; i <= n; i++) {
            String s = Integer.toString(i);
            for (char ch : s.toCharArray()) {
                if (ch == '3' || ch == '6' || ch == '9') {
                    cnt++;
                }
            }
        }
        bw.write(cnt+"\n");
        bw.flush();
    }
}
