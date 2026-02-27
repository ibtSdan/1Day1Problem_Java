import java.util.*;

class Solution {
    public String[] solution(String[] names) {
        ArrayList<String> A = new ArrayList<>();
        for (int i = 0; i < names.length; i = i+5) {
            A.add(names[i]);
        }
        
        String[] ans = new String[A.size()];
        for (int i = 0; i < A.size(); i++) {
            ans[i] = A.get(i);
        }
        return ans;
    }
}