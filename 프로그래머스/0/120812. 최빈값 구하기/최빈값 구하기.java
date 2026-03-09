import java.util.*;

class Solution {
    public int solution(int[] array) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : array) {
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        
        ArrayList<Integer> A = new ArrayList<>();
        int max = 0;
        for (int v : map.values()) {
            max = Math.max(v, max);
        }
        for (int key : map.keySet()) {
            if (map.get(key) == max) {
                A.add(key);
            }
        }
        return A.size()==1 ? A.get(0) : -1;
    }
}