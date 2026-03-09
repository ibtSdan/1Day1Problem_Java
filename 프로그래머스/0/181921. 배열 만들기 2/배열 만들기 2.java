import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        ArrayList<Integer> A = new ArrayList<>();
        for (int i = l; i <= r; i++) {
            if (check(i)) {
                A.add(i);
            }
        }
        Collections.sort(A);
        int[] ans = new int[A.size()];
        for (int i = 0; i < A.size(); i++) {
            ans[i] = A.get(i);
        }
        return A.size() == 0 ? new int[] {-1} : ans;
    }
    
    public boolean check(int v) {
        String s = String.valueOf(v);
        for (char c : s.toCharArray()) {
            if (c != '0' && c != '5') {
                return false;
            }
        }
        return true;
    }
}