import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> A = new ArrayList<>();
        for (int i : arr) {
            if (i%divisor==0) {
                A.add(i);
            }
        }
        Collections.sort(A);
        int[] ans = new int[A.size()];
        for (int i = 0; i < A.size(); i++) {
            ans[i] = A.get(i);
        }
        return A.size() == 0 ? new int[]{-1} : ans;
    }
}