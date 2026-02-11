import java.io.*;
import java.util.*;

public class Main {
    static BufferedWriter bw;
    static int n;
    static int[] A;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        n = Integer.parseInt(br.readLine());
        A = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(A);
        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            int k = Integer.parseInt(st.nextToken());
            boolean check = search(k);
            if (check) {
                bw.write("1\n");
            } else {
                bw.write("0\n");
            }
        }
        bw.flush();
    }

    static boolean search(int k) {
        int s = 0;
        int e = n-1;
        while (s <= e) {
            int mid = (s+e)/2;
            if (A[mid] == k) {
                return true;
            } else if (A[mid] > k) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return false;
    }
}
