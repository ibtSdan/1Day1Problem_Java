class Solution {
    public double solution(int[] numbers) {
        double ans = 0.0;
        for (int i : numbers) {
            ans += i;
        }
        return (double) ans / numbers.length;
    }
}