import java.util.*;

class Solution {
    public int solution(String dartResult) {
        StringBuilder sb = new StringBuilder(dartResult);
        String string = sb.reverse().toString();
        int ans = 0;
        Map<String, Integer> poww = new HashMap<>();
        poww.put("S", 1);
        poww.put("D", 2);
        poww.put("T", 3);
        int temp = 1;
        boolean check = false;
        boolean pre = false;
        int pow = 0;
        for (int i = 0; i < string.length(); i++) {
            String s = string.substring(i, i+1);
            if (s.equals("0")) {
                if (i+1 < string.length() && string.substring(i+1, i+2).equals("1")) {
                    s = "10";
                    i++;
                }
            }
            if (s.equals("#")) {
                temp *= -1;
            } else if (s.equals("*")) {
                check = true;
            } else if (s.equals("S") || s.equals("D") || s.equals("T")) {
                pow = poww.get(s);
            } else {
                for (int j = 0; j < pow; j++) {
                    temp *= Integer.parseInt(s);
                }
                if (pre) {
                    temp *= 2;
                    if (!check) {
                        pre = false;
                    }
                }
                if (check) {
                    temp *= 2;
                    pre = true;
                    check = false;
                }
                System.out.println(s+" "+temp);
                ans += temp;
                temp = 1;
            }
        }
        return ans;
    }
}