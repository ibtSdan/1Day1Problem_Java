import java.util.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        ArrayList<Integer> A = new ArrayList<>();
        for (int i = 0; i < num_list.length; i = i+n) {
            A.add(num_list[i]);
        }
        
        int[] ans = new int[A.size()];
        for (int i = 0; i < A.size(); i++) {
            ans[i] = A.get(i);
        }
        return ans;
    }
}