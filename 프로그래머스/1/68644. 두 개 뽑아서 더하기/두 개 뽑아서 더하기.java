import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < numbers.length-1; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                int num = numbers[i] + numbers[j];
                set.add(num);
            }
        }
        int[] ans = new int[set.size()];
        int idx = 0;
        for (int i : set) {
            ans[idx++] = i;
        }
        Arrays.sort(ans);
        return ans;
    }
}