import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int[] a = Arrays.copyOfRange(arr, intervals[0][0], intervals[0][1]+1);
        int[] b = Arrays.copyOfRange(arr, intervals[1][0], intervals[1][1]+1);
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