import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
        int ans = 0;
        int abs = 101;
        Arrays.sort(array);
        for (int i : array) {
            int temp = Math.abs(n - i);
            if (temp < abs) {
                abs = temp;
                ans = i;
            }
        }
        return ans;
    }
}