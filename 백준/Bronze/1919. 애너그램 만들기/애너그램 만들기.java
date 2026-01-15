import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String a = br.readLine();
        String b = br.readLine();

        int[] cnt1 = new int[26];
        int[] cnt2 = new int[26];

        for (char c : a.toCharArray()) {
            cnt1[c - 'a']++;
        }
        for (char c : b.toCharArray()) {
            cnt2[c - 'a']++;
        }

        int ans = 0;
        for (int i = 0; i < 26; i++) {
            ans += Math.abs(cnt1[i] - cnt2[i]);
        }
        bw.write(ans+"\n");
        bw.flush();
    }
}
