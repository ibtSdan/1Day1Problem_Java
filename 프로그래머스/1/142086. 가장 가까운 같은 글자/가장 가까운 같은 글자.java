import java.util.*;

class Solution {
    public int[] solution(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int[] ans = new int[s.length()];
        for (int i = 0; i < ans.length; i++) {
            char c = s.charAt(i);
            ans[i] = i - map.getOrDefault(c, i+1);
            map.put(c, i);
        }
        return ans;
    }
}