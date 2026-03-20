import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < survey.length; i++) {
            if (choices[i] == 4) {
                continue;
            }
            char c = '0';
            if (choices[i] < 4) {
                c = survey[i].charAt(0);
            } else {
                c = survey[i].charAt(1);
            }
            if (choices[i] == 1 || choices[i] == 7) {
                map.put(c, map.getOrDefault(c, 0)+3);
            } else if (choices[i] == 2 || choices[i] == 6) {
                map.put(c, map.getOrDefault(c, 0)+2);
            } else {
                map.put(c, map.getOrDefault(c, 0)+1);
            }
        }
        System.out.println(map);
        String ans = "";
        if (map.getOrDefault('R', 0) >= map.getOrDefault('T', 0)) {
            ans += "R";
        } else {
            ans += "T";
        }
        
        if (map.getOrDefault('C', 0) >= map.getOrDefault('F', 0)) {
            ans += "C";
        } else {
            ans += "F";
        }
        
        if (map.getOrDefault('J', 0) >= map.getOrDefault('M', 0)) {
            ans += "J";
        } else {
            ans += "M";
        }
        
        if (map.getOrDefault('A', 0) >= map.getOrDefault('N', 0)) {
            ans += "A";
        } else {
            ans += "N";
        }
        
        return ans;
    }
}