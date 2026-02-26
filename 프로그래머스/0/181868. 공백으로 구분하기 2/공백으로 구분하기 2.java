class Solution {
    public String[] solution(String my_string) {
        my_string = my_string.replaceAll("^\\s+", "");
        String[] ans = my_string.split("\\s+");
        return ans;
    }
}