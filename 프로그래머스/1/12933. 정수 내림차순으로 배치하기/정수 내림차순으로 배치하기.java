import java.util.*;

class Solution {
    public long solution(long n) {
        ArrayList<Character> A = new ArrayList<>();
        for (char c : String.valueOf(n).toCharArray()) {
            A.add(c);
        }
        A.sort(Comparator.reverseOrder());
        String ans = "";
        for (Character c : A) {
            ans += c;
        }
        return Long.parseLong(ans);
    }
}