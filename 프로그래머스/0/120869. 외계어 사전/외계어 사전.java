import java.util.*;

class Solution {
    public int solution(String[] spell, String[] dic) {
        Map<String, Integer> ansMap = new HashMap<>();
        for (String s : spell) {
            ansMap.put(s, 1);
        }
        
        for (String word : dic) {
            Map<String, Integer> map = new HashMap<>();
            for (int i = 0; i < word.length(); i++) {
                String s = word.substring(i, i+1);
                map.put(s, map.getOrDefault(s, 0)+1);
            }
            if (map.equals(ansMap)) {
                return 1;
            }
        }
        return 2;
    }
}