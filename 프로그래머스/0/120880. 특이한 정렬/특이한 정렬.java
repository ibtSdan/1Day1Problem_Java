import java.util.*;

class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] ans = new int[numlist.length];
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> {
                if (a[0] != b[0]){
                    return a[0] - b[0];
                } else {
                    return b[1] - a[1];
                }});
        for (int i : numlist) {
            pq.add(new int[] {Math.abs(i - n), i});
        }
        for (int i = 0; i < numlist.length; i++) {
            ans[i] = pq.poll()[1];
        }
        return ans;
    }
}