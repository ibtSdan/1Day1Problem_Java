class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int c = denom1 * denom2 / gcd(denom1, denom2);
        int a = numer1 * c/denom1;
        int b = numer2 * c/denom2;
        int[] ans = new int[2];
        ans[0] = a+b;
        ans[1] = c;
        int min = gcd(ans[0], ans[1]);
        ans[0] /= min;
        ans[1] /= min;
        return ans;
    }
    
    public int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a%b);
    }
}