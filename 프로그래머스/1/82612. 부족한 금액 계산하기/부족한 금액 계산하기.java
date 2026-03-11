class Solution {
    public long solution(int price, int money, int count) {
        long sum = 0;
        for (long l = price; l <= price*count; l = l+price) {
            sum += l;
        }
        long ans = sum - money;
        if (ans < 0) {
            return 0;
        }
        return ans;
    }
}