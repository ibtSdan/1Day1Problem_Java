import java.util.*;

class Solution {
    public int[] solution(int[][] score) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int[] s : score) {
            list.add(s[0]+s[1]);
        }
        list.sort(Comparator.reverseOrder());
        int[] ans = new int[score.length];
        for (int i = 0; i < score.length; i++) {
            ans[i] = list.indexOf(score[i][0] + score[i][1])+1;
        }
        
        return ans;
    }
}