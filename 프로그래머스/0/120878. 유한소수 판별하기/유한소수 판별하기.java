class Solution {
    public int solution(int a, int b) {
        int min = gcd(a, b);
        b = b/min;
        return check(b);
    }
    
    public int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a%b);
    }
    
    public int check(int v) {
        while (v%2 == 0) {
            v /= 2;
        }
        while (v%5 == 0) {
            v /= 5;
        }
        return v == 1 ? 1 : 2;
    }
}