class Solution {
    public int solution(String binomial) {
        String[] S = binomial.split(" ");
        int a = Integer.parseInt(S[0]);
        int b = Integer.parseInt(S[2]);
        String op = S[1];
        if (op.equals("+")) {
            return a+b;
        } else if (op.equals("-")) {
            return a-b;
        } else {
            return a*b;
        }
    }
}