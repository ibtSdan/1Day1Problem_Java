import java.util.*;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int a = slicer[0], b = slicer[1], c = slicer[2];
        if (n == 1) {
            return Arrays.copyOfRange(num_list, 0, b+1);
        } else if (n == 2) {
            return Arrays.copyOfRange(num_list, a, num_list.length);
        } else if (n == 3) {
            return Arrays.copyOfRange(num_list, a, b+1);
        } else {
            ArrayList<Integer> A = new ArrayList<>();
            for (int i = a; i <= b; i = i+c) {
                A.add(num_list[i]);
            }
            int[] ans = new int[A.size()];
            for (int i = 0; i < A.size(); i++) {
                ans[i] = A.get(i);
            }
            return ans;
        }
    }
}