import java.util.*;

class Solution {
    public int solution(String[] strArr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (String s : strArr) {
            int n = s.length();
            map.put(n, map.getOrDefault(n, 0)+1);
        }
        int max = 0;
        for (int i : map.keySet()) {
            max = Math.max(max, map.get(i));
        }
        return max;
    }
}