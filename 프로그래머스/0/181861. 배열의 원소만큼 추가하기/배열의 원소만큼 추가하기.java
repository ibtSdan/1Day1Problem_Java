import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> A = new ArrayList<>();
        for (int i : arr) {
            for (int j = 0; j < i; j++) {
                A.add(i);
            }
        }
        int[] ans = new int[A.size()];
        for (int i = 0; i < A.size(); i++) {
            ans[i] = A.get(i);
        }
        return ans;
    }
}