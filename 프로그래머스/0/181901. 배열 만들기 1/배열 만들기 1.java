import java.util.*;

class Solution {
    public int[] solution(int n, int k) {
        ArrayList<Integer> A = new ArrayList<>();
        for (int i = k; i <= n; i = i+k) {
            A.add(i);
        }
        
        int[] ans = new int[A.size()];
        for (int i = 0; i < A.size(); i++) {
            ans[i] = A.get(i);
        }
        return ans;
    }
}