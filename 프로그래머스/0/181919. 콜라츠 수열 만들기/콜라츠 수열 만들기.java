import java.util.*;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> A = new ArrayList<>();
        A.add(n);
        while (n != 1) {
            if (n%2 == 0) {
                n /= 2;
            } else {
                n = 3 * n + 1;
            }
            A.add(n);
        }
        int[] ans = new int[A.size()];
        for (int i = 0; i < A.size(); i++) {
            ans[i] = A.get(i);
        }
        return ans;
    }
}