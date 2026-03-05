class Solution {
    public int solution(int[] numbers, int k) {
        int idx = 0;
        while (k-1 > 0) {
            idx = idx + 2;
            if (idx == numbers.length) {
                idx = 0;
            } else if (idx == numbers.length + 1) {
                idx = 1;
            }
            k--;
        }
        return idx+1;
    }
}