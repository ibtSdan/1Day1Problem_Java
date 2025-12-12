import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        String line = br.readLine();

        int ans = 0;
        for (char ch : line.toCharArray()) {
            ans += ch - '0';
        }
        bw.write(ans+"\n");
        bw.flush();
    }
}
