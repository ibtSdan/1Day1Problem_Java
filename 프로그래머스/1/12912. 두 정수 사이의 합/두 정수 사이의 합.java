class Solution {
    public long solution(int a, int b) {
        int s = Math.min(a, b);
        int e = Math.max(a, b);
        long sum = 0;
        for (int i = s; i <= e; i++) {
            sum += i;
        }
        return sum;
    }
}