import java.util.*;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> A = new ArrayList<>();
        for (int i = 1; i < Math.sqrt(n); i++) {
            if (n%i == 0) {
                A.add(i);
                A.add(n/i);
            }
        }
        if (Math.sqrt(n) == (int)Math.sqrt(n)) {
            A.add((int)Math.sqrt(n));
        }
        Collections.sort(A);
        int[] ans = new int[A.size()];
        for (int i = 0; i < A.size(); i++) {
            ans[i] = A.get(i);
        }
        return ans;
    }
}