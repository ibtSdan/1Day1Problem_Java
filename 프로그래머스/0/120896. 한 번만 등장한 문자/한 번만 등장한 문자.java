import java.util.*;

class Solution {
    public String solution(String s) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            String sub = s.substring(i, i+1);
            map.put(sub, map.getOrDefault(sub, 0)+1);
        }
        ArrayList<String> A = new ArrayList<>();
        for (String key : map.keySet()) {
            if (map.get(key) == 1) {
                A.add(key);
            }
        }
        Collections.sort(A);
        String ans = "";
        for (String temp : A) {
            ans += temp;
        }
        return ans;
    }
}