import java.util.*;

class Solution {
    public int solution(int n, int m, int[] section) {
        ArrayList<Integer> A = new ArrayList<>();
        for (int i : section) {
            A.add(i);
        }
        int cnt = 0;
        while (!A.isEmpty()) {
            int num = A.get(0);
            for (int i = num; i < num+m; i++) {
                if (A.size() == 0) {
                    break;
                }
                if (i == A.get(0)) {
                    A.remove(0);
                }
            }
            cnt++;
        }
        return cnt;
    }
}