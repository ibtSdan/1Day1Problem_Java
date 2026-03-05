class Solution {
    public int solution(String my_string) {
        String[] line = my_string.split(" ");
        int ans = Integer.parseInt(line[0]);
        int y = 1;
        for (int i = 1; i < line.length; i = i+2) {
            y = line[i].equals("+") ? 1 : -1;
            ans += Integer.parseInt(line[i+1]) * y;
        }
        return ans;
    }
}