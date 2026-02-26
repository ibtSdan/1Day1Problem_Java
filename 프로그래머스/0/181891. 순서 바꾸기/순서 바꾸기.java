import java.util.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] a = Arrays.copyOfRange(num_list, n, num_list.length);
        int[] b = Arrays.copyOfRange(num_list, 0, n);
        ArrayList<Integer> A = new ArrayList<>();
        for (int i : a) {
            A.add(i);
        }
        for (int i : b) {
            A.add(i);
        }
        int[] ans = new int[A.size()];
        for (int i = 0; i < A.size(); i++) {
            ans[i] = A.get(i);
        }
        return ans;
    }
}