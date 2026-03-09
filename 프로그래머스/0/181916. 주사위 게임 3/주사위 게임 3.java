import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(a, map.getOrDefault(a, 0)+1);
        map.put(b, map.getOrDefault(b, 0)+1);
        map.put(c, map.getOrDefault(c, 0)+1);
        map.put(d, map.getOrDefault(d, 0)+1);
        
        // p p p p
        if (map.size() == 1) {
            return a * 1111;
        }
        
        if (map.size() == 2) {
            int p = 0, q = 0;
            if (map.get(a)==3 || map.get(b)==3 || map.get(c)==3 || map.get(d)==3) {
                // p p p q
                for (int key : map.keySet()) {
                    if (map.get(key) == 3) {
                        p = key;
                    } else {
                        q = key;
                    }
                }
                return (10*p+q) * (10*p+q);
            } else {
                // p p q q
                if (a == b) {
                    p = a;
                    q = c;
                } else {
                    p = a;
                    q = b;
                }
                return (p+q) * Math.abs(p-q);
            }
        }
        
        // p p q r
        if (map.size() == 3) {
            int temp = 1;
            for (int key : map.keySet()) {
                if (map.get(key) == 1) {
                    temp *= key;
                }
            }
            return temp;
        }
        
        // 다 다름
        int ans = Math.min(a,b);
        ans = Math.min(ans, c);
        ans = Math.min(ans, d);
        return ans;
    }
}