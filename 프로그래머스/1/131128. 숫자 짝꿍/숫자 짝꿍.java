import java.util.*;

class Solution {
    public String solution(String X, String Y) {
        int[] x = new int[10];
        int[] y = new int[10];
        for (char c : X.toCharArray()) {
            x[c-'0']++;
        }
        for (char c : Y.toCharArray()) {
            y[c-'0']++;
        }
        String ans = "";
        for (int i = 9; i >= 0; i--) {
            int min = Math.min(x[i], y[i]);
            if (min != 0) {
                ans += String.valueOf(i).repeat(min);
            }
        }
        if (ans.equals("")) {
            ans = "-1";
        } else if (ans.charAt(0) == '0') {
            ans = "0";
        }
        return ans; 
    }
}