import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int ans = 0;
        Arrays.sort(score);
        for (int i = 0; i < score.length/2; i++) {
            int temp = score[i];
            score[i] = score[score.length-1-i];
            score[score.length-1-i] = temp;
        }

        for (int i = 0; i < score.length; i = i + m) {
            int length = i + m - 1;
            if (length >= score.length) {
                break;
            }
            ans += score[length] * m;
        }
        return ans;
    }
}