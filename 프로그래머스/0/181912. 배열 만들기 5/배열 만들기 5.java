import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        ArrayList<Integer> A = new ArrayList<>();
        for (int i = 0; i < intStrs.length; i++) {
            String sub = intStrs[i].substring(s, s+l);
            int num = Integer.parseInt(sub);
            if (num > k) {
                A.add(num);
            }
        }
        
        int[] ans = new int[A.size()];
        for (int i = 0; i < A.size(); i++) {
            ans[i] = A.get(i);
        }
        return ans;
    }
}