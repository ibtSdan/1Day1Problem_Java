import java.io.*;
import java.util.*;

public class Main {
    static BufferedWriter bw;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 처음엔 끝나는게 제일 빠른거
        // before 끝 <= after 시작

        class Node {
            int start;
            int end;
            Node (int s, int e) {
                start = s;
                end = e;
            }
        }

        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Node> pq = new PriorityQueue<>(
                (a, b) -> {
                    if (a.end != b.end) {
                        return a.end - b.end;
                    }
                    return a.start - b.start;
        });
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            pq.add(new Node(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
        }

        int ans = 1;
        Node node = pq.poll();
        int s = node.start;
        int e = node.end;

        for (int i = 1; i < n; i++) {
            Node next = pq.poll();
            if (e <= next.start) {
                e = next.end;
                ans++;
            }
        }

        bw.write(ans+"\n");
        bw.flush();
    }
}
