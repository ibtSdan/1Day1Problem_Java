import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> a[0] - b[0]);
        for (int i = 0; i < rank.length; i++) {
            if (attendance[i]) {
                pq.add(new int[] {rank[i], i});
            }
        }
        int a = pq.poll()[1];
        int b = pq.poll()[1];
        int c = pq.poll()[1];
        return 10000*a + 100*b + c;
    }
}