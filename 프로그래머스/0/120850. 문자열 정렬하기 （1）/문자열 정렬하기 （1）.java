import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        ArrayList<Integer> A = new ArrayList<>();
        for (char c : my_string.toCharArray()) {
            if (Character.isDigit(c)) {
                A.add(c - '0');
            }
        }
        Collections.sort(A);
        int[] ans = new int[A.size()];
        for (int i = 0; i < A.size(); i++) {
            ans[i] = A.get(i);
        }
        return ans;
    }
}