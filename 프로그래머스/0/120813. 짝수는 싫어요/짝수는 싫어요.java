import java.util.*;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> A = new ArrayList<>();
        for (int i = 1; i <= n; i = i+2) {
            A.add(i);
        }
        int[] ans = new int [A.size()];
        for (int i = 0; i < A.size(); i++) {
            ans[i] = A.get(i);
        }
        return ans;
    }
}