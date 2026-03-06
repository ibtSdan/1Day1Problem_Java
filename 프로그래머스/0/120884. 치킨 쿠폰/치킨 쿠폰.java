class Solution {
    public int solution(int chicken) {
        int ans = 0;
        int co = chicken;
        while (co >= 10) {
            ans += co/10;
            co = co/10 + co%10; 
        }
        return ans;
    }
}