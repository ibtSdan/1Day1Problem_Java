import java.util.*;

class Solution {
    public String solution(String my_string) {
        char[] C = new char[my_string.length()];
        int idx = 0;
        for (char c : my_string.toCharArray()) {
            if (Character.isUpperCase(c)) {
                C[idx] = Character.toLowerCase(c);
            } else {
                C[idx] = c;
            }
            idx++;
        }
        Arrays.sort(C);
        
        String ans = "";
        for (char c : C) {
            ans += c;
        }
        return ans;
    }
}