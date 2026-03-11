import java.util.*;

class Solution {
    public String solution(String s) {
        char[] c = s.toCharArray();
        Arrays.sort(c);
        String ans = new StringBuilder(new String(c)).reverse().toString();
        return ans;
    }
}