import java.io.*;
import java.util.*;

public class Main {
    static int[] my;
    static int[] minDna;
    static int cnt;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int S = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());
        int ans = 0;

        char[] A = br.readLine().toCharArray();
        minDna = new int[4];
        st = new StringTokenizer(br.readLine());
        cnt = 0;
        for (int i = 0; i < 4; i++) {
            minDna[i] = Integer.parseInt(st.nextToken());
            if (minDna[i] == 0) {
                cnt++;
            }
        }

        my = new int[4];
        for (int i = 0; i < P; i++) {
            Add(A[i]);
        }
        if (cnt == 4) {
            ans++;
        }

        for (int i = P; i < S; i++) {
            int j = i - P;
            Add(A[i]);
            Remove(A[j]);
            if (cnt == 4) {
                ans++;
            }
        }
        bw.write(ans+"\n");
        bw.flush();


    }

    static void Add(char c) {
        switch (c) {
            case 'A':
                my[0]++;
                if (my[0] == minDna[0]) {
                    cnt++;
                }
                break;
            case 'C':
                my[1]++;
                if (my[1] == minDna[1]) {
                    cnt++;
                }
                break;
            case 'G':
                my[2]++;
                if (my[2] == minDna[2]) {
                    cnt++;
                }
                break;
            case 'T':
                my[3]++;
                if (my[3] == minDna[3]) {
                    cnt++;
                }
                break;
        }
    }

    static void Remove(char c) {
        switch (c) {
            case 'A':
                my[0]--;
                if (my[0] == minDna[0] - 1) {
                    cnt--;
                }
                break;
            case 'C':
                my[1]--;
                if (my[1] == minDna[1] - 1) {
                    cnt--;
                }
                break;
            case 'G':
                my[2]--;
                if (my[2] == minDna[2] - 1) {
                    cnt--;
                }
                break;
            case 'T':
                my[3]--;
                if (my[3] == minDna[3] - 1) {
                    cnt--;
                }
                break;
        }
    }
}
