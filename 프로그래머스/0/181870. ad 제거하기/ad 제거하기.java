import java.util.*;

class Solution {
    public String[] solution(String[] strArr) {
        ArrayList<String> ans = new ArrayList<>();
        for (String s : strArr) {
            if (!s.contains("ad")) {
                ans.add(s);
            }
        }
        String[] result = new String[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            result[i] = ans.get(i);
        }
        return result;
    }
}