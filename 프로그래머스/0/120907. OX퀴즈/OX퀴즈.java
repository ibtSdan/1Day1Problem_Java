class Solution {
    public String[] solution(String[] quiz) {
        String[] ans = new String[quiz.length];
        for (int i = 0; i < quiz.length; i++) {
            String result = "";
            String[] line = quiz[i].split(" ");
            if (line[1].equals("+")) {
                int left = Integer.parseInt(line[0]) + Integer.parseInt(line[2]);
                int right = Integer.parseInt(line[4]);
                result = left == right ? "O" : "X";
            } else {
                int left = Integer.parseInt(line[0]) - Integer.parseInt(line[2]);
                int right = Integer.parseInt(line[4]);
                result = left == right ? "O" : "X";
            }
            ans[i] = result;
        }
        return ans;
    }
}