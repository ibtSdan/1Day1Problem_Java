import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        ArrayList<Integer> A = new ArrayList<>();
        for (int i : arr) {
            if (!A.isEmpty() && i == A.get(A.size()-1)) {
                continue;
            }
            A.add(i);
        }
        int[] ans = new int[A.size()];
        for (int i = 0; i < A.size(); i++) {
            ans[i] = A.get(i);
        }
        return ans;
    }
}