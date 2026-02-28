import java.util.*;

class Solution {
    public int solution(String before, String after) {
        int[] a = new int[28];
        int[] b = new int[28];
        for (char c : before.toCharArray()) {
            a[c-97]++;
        }
        for (char c : after.toCharArray()) {
            b[c-97]++;
        }
        for (int i = 0; i < 28; i++) {
            if (a[i] != b[i]) {
                return 0;
            }
        }
        return 1;
    }
}