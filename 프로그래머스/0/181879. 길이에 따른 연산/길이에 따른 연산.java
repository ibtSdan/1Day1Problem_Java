class Solution {
    public int solution(int[] num_list) {
        int n = num_list.length;
        if (n >= 11) {
            int sum = 0;
            for (int i : num_list) {
                sum += i;
            }
            return sum;
        } else {
            int ans = 1;
            for (int i : num_list) {
                ans *= i;
            }
            return ans;
        }
    }
}