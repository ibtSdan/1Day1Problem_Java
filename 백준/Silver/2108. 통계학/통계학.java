import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int sum = 0;
        int[] arr = new int[n];
        int[] count = new int[8001];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
            count[arr[i]+4000]++;
        }
        double avg = (double) sum / n;
        bw.write(Math.round(avg) +"\n");

        Arrays.sort(arr);
        bw.write(arr[n/2]+"\n");

        int max = 0;
        for (int i = 0; i < 8001; i++) {
            max = Math.max(max, count[i]);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 8001; i++) {
            if (count[i] == max) {
                list.add(i-4000);
            }
        }
        Collections.sort(list);
        bw.write(list.size() > 1 ? list.get(1)+"\n" : list.get(0)+"\n");

        bw.write(arr[n-1] - arr[0]+"\n");
        bw.flush();
    }
}
