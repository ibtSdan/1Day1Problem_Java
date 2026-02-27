class Solution {
    public int solution(int n) {
        int min = gcd(n, 6);
        int max = n * 6 / min;
        return max/6;
    }
    
    static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a%b);
    }
}