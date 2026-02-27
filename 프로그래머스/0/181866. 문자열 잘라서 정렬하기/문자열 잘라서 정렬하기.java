import java.util.*;

class Solution {
    public String[] solution(String myString) {
        String[] s = myString.split("x");
        ArrayList<String> A = new ArrayList<>();
        for (String ss : s) {
            if (!ss.equals("")) {
                A.add(ss);
            }
        }
        String[] ans = new String[A.size()];
        for (int i = 0; i < A.size(); i++) {
            ans[i] = A.get(i);
        }
        Arrays.sort(ans);
        return ans;
    }
}