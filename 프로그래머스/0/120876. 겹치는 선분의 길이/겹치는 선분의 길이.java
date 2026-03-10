class Solution {
    public int solution(int[][] lines) {
        int[] count = new int[201];
        for (int[] line : lines) {
            for (int i = line[0]; i < line[1]; i++) {
                count[i+100]++;
            }
        }
        int ans = 0;
        for (int i = 0; i < 201; i++) {
            if (count[i] >= 2) {
                ans++;
            }
        }
        return ans;
    }
}