class Solution {
    public int[] solution(int num, int total) {
        int[] ans = new int[num];
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        int s = 1, e = num;
        while (sum != total) {
            if (sum > total) {
                sum -= e;
                e--;
                s--;
                sum += s;
            } else {
                sum -= s;
                s++;
                e++;
                sum += e;
            }
        }
        for (int i = s; i <= e; i++) {
            ans[i-s] = i;
        }
        return ans;
    }
}