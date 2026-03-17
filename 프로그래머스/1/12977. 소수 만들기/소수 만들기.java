import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int[] num = new int[3001];
        for (int i = 2; i < 3001; i++) {
            num[i] = i;
        }
        boolean[] check = new boolean[3001];
        Arrays.fill(check, true);
        for (int i = 2; i <= Math.sqrt(3001); i++) {
            if (!check[i]) {
                continue;
            }
            for (int j = i+i; j < 3001; j = j+i) {
                check[j] = false;
            }
        }
        
        int ans = 0;
        for (int i = 0; i < nums.length-2; i++) {
            for (int j = i+1; j < nums.length-1; j++) {
                for (int k = j+1; k < nums.length; k++) {
                    if (check[nums[i]+nums[j]+nums[k]]) {
                        ans++;
                    }
                }
            }
        }
        return ans;
    }
}