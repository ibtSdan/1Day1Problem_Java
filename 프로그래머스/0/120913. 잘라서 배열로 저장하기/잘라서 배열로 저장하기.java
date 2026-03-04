import java.util.*;

class Solution {
    public String[] solution(String my_str, int n) {
        ArrayList<String> A = new ArrayList<>();
        for (int i = 0; i < my_str.length(); i = i+n) {
            if (i+n >= my_str.length()) {
                A.add(my_str.substring(i, my_str.length()));
            } else {
                A.add(my_str.substring(i, i+n));
            }
        }
        String[] ans = new String[A.size()];
        for (int i = 0; i < A.size(); i++) {
            ans[i] = A.get(i);
        }
        return ans;
    }
}