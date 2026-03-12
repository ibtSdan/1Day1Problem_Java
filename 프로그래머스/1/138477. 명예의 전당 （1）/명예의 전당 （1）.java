import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] ans = new int[score.length];
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < ans.length; i++) {
            if (pq.size() < k) {
                pq.add(score[i]);
            } else {
                if (score[i] >= pq.peek()) {
                    pq.poll();
                    pq.add(score[i]);
                }
            }
            ans[i] = pq.peek();
        }
        return ans;
    }
}