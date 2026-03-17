import java.util.*;

class Node {
    double rate;
    int stage;
    Node(double r, int s) {
        rate = r;
        stage = s;
    }
}
class Solution {
    public int[] solution(int N, int[] stages) {
        int total = stages.length;
        PriorityQueue<Node> pq = new PriorityQueue<>((a,b) -> {
            if (a.rate == b.rate) {
                return a.stage - b.stage;
            }
            return Double.compare(b.rate, a.rate);
        });
        
        for (int stage = 1; stage <= N; stage++) {
            int cnt = 0;
            for (int c = 0; c < stages.length; c++) {
                if (stages[c] == stage) {
                    cnt++;
                }
            }
            double rate = 0;
            if (total != 0) {
                rate = (double)cnt/total;
            }
            pq.add(new Node(rate, stage));
            total -= cnt;
        }
        int[] ans = new int[N];
        for (int i = 0; i < N; i++) {
            ans[i] = pq.poll().stage;
        }
        return ans;
    }
}