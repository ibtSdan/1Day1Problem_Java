import java.util.*;

class Solution {
    public int[] solution(String myString) {
        ArrayList<Integer> A = new ArrayList<>();
        int cnt = 0;
        for (char c : myString.toCharArray()) {
            if (c == 'x') {
                A.add(cnt);
                cnt = 0;
            } else {
                cnt++;
            }
        }
        A.add(cnt);
        int[] ans = new int[A.size()];
        for (int i = 0; i < A.size(); i++) {
            ans[i] = A.get(i);
        }
        return ans;
    }
}