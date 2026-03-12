class Solution {
    public int[] solution(String s) {
        boolean[] check = new boolean[26];
        int[] index = new int[26];
        int[] ans = new int[s.length()];
        
        int i = 0;
        for (char c : s.toCharArray()) {
            int a = c - 97;
            if (!check[a]) {
                ans[i] = -1;
                check[a] = true;
                index[a] = i;
            } else {
                ans[i] = i - index[a];
                index[a] = i;
            }
            i++;
        }
        
        return ans;
    }
}