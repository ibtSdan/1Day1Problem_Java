import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < survey.length; i++) {
            if (choices[i] < 4) {
                map.put(survey[i].charAt(0), map.getOrDefault(survey[i].charAt(0), 0)+(4-choices[i]));
            } else if (choices[i] > 4) {
                map.put(survey[i].charAt(1), map.getOrDefault(survey[i].charAt(1), 0)+(choices[i]-4));
            }
        }

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