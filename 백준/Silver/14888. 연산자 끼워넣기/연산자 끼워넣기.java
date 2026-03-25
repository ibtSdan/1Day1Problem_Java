import java.io.*;
import java.util.*;

public class Main {
    static BufferedWriter bw;
    static int n, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
    static int[] nums, op;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        n = Integer.parseInt(br.readLine());
        nums = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        op = new int[4];
        for (int i = 0; i < 4; i++) {
            op[i] = Integer.parseInt(st.nextToken());
        }

        dfs(1, nums[0]);
        System.out.println(max);
        System.out.println(min);
    }

    static void dfs(int idx, int current) {
        if (idx == n) {
            max = Math.max(current, max);
            min = Math.min(current, min);
            return;
        }

        for (int i = 0; i < 4; i++) {
            if (op[i] > 0) {
                op[i]--;
                int next = 0;
                if (i == 0) next = current + nums[idx];
                else if (i == 1) next = current - nums[idx];
                else if (i == 2) next = current * nums[idx];
                else if (i == 3) next = current / nums[idx];

                dfs(idx+1, next);

                op[i]++;
            }
        }
    }
}
