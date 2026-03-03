import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i : emergency) {
            pq.add(-i);
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 1; i <= emergency.length; i++) {
            map.put(-pq.poll(), i);
        }
        int[] ans = new int[emergency.length];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = map.get(emergency[i]);
        }
        return ans;
    }
}