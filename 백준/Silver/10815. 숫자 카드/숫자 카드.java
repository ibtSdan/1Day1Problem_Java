import java.io.*;
import java.util.*;

public class Main {
    static int[] data;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        data = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            data[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(data);
        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            int k = Integer.parseInt(st.nextToken());
            int ans = Sort(k);
            bw.write(ans+" ");
        }
        bw.flush();
    }

    static int Sort(int k) {
        int s = 0;
        int e = data.length - 1;
        while (s <= e) {
            int mid = (s+e)/2;
            if (data[mid] == k) {
                return 1;
            } else if (data[mid] > k) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return 0;
    }
}
