import java.util.*;

class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] ans = new int[numbers.length];
        if (direction.equals("right")) {
            int[] b = Arrays.copyOfRange(numbers, 0, numbers.length-1);
            ans[0] = numbers[numbers.length-1];
            for (int i = 0; i < b.length; i++) {
                ans[i+1] = b[i];
            }
        } else {
            int[] a = Arrays.copyOfRange(numbers, 1, numbers.length);
            for (int i = 0; i < a.length; i++) {
                ans[i] = a[i];
            }
            ans[numbers.length-1] = numbers[0];
        }
        return ans;
    }
}