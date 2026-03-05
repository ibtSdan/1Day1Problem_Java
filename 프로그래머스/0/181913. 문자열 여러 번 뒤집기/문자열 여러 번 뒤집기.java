class Solution {
    public String solution(String my_string, int[][] queries) {
        String ans = "";
        for (int i = 0; i < queries.length; i++) {
            StringBuilder sb = new StringBuilder();
            int s = queries[i][0], e = queries[i][1];
            sb.append(my_string.substring(s, e+1));
            ans = my_string.substring(0, s) + sb.reverse() + my_string.substring(e+1, my_string.length());
            my_string = ans;
        }
        return ans;
    }
}