import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int n = arr.length;
        int leng = 0;
        if (n == 1) {
            return arr;
        }
        for (int i = 2; i <= 10000; i = i*2) {
            if (i >= n) {
                leng = i;
                break;
            }
        }
        ArrayList<Integer> A = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            A.add(arr[i]);
        }
        for (int i = 0; i < leng-n; i++) {
            A.add(0);
        }
        int[] ans = new int[A.size()];
        for (int i = 0; i < A.size(); i++) {
            ans[i] = A.get(i);
        }
        return ans;
    }
}