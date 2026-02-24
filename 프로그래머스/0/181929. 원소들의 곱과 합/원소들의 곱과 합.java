class Solution {
    public int solution(int[] num_list) {
        int x = 1;
        int sum = 0;
        for (int i : num_list) {
            x *= i;
            sum += i;
        }
        return x < sum*sum ? 1 : 0;
    }
}