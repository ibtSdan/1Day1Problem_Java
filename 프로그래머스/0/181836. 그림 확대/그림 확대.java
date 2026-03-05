class Solution {
    public String[] solution(String[] picture, int k) {
        String[] ans = new String[picture.length*k];
        int idx = 0;
        for (int i = 0; i < picture.length; i++) {
            String line = picture[i];
            String temp = "";
            for (int j = 0; j < line.length(); j++) {
                String s = line.substring(j, j+1);
                for (int a = 0; a < k; a++) {
                    temp += s;
                }
            }
            for (int a = 0; a < k; a++) {
                ans[idx] = temp;
                idx++;
            }
        }
        return ans;
    }
}