class Solution {
    public String solution(String my_string, int[] index_list) {
        String ans = "";
        for (int i : index_list) {
            ans += my_string.charAt(i);
        }
        return ans;
    }
}