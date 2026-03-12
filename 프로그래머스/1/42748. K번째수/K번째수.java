import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] ans = new int[commands.length];
        for (int i = 0; i < ans.length; i++) {
            int[] command = commands[i];
            int[] temp = Arrays.copyOfRange(array, command[0]-1, command[1]);
            Arrays.sort(temp);
            ans[i] = temp[command[2]-1];
        }
        return ans;
    }
}