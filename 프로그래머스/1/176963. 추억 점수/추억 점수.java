import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] ans = new int[photo.length];
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < name.length; i++) {
            map.put(name[i], yearning[i]);
        }
        
        int idx = 0;
        for (String[] string : photo) {
            for (String s : string) {
                ans[idx] += map.getOrDefault(s, 0);
            }
            idx++;
        }
        return ans;
    }
}