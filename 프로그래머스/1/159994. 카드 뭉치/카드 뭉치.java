class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int a = 0, b = 0;
        for (String s : goal) {
            if (a < cards1.length && s.equals(cards1[a])) {
                a++;
            } else if (b < cards2.length && s.equals(cards2[b])) {
                b++;
            } else {
                return "No";
            }
        }
        return "Yes";
    }
}