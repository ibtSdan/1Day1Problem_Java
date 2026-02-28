import java.util.*;

class Solution {
    public String solution(String my_string) {
        String ans = "";
        Set<String> set = new HashSet<>();
        for (int i = 0; i < my_string.length(); i++) {
            String s = my_string.substring(i, i+1);
            if (!set.contains(s)) {
                ans += s;
                set.add(s);
            }
        }
        return ans;
    }
}