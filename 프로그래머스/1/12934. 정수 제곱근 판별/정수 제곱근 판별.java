class Solution {
    public long solution(long n) {
        long num = (long) Math.sqrt(n);
        return Math.sqrt(n) == num ? (num+1)*(num+1) : -1;
    }
}