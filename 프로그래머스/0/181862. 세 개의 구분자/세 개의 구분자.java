class Solution {
    public String[] solution(String myStr) {
        String s = myStr.replace("a", " ");
        s = s.replace("b", " ");
        s = s.replace("c", " ");
        s = s.replaceAll("^\\s+", "");
        String[] ans = s.split("\\s+");
        return ans[0].equals("") ? new String[] {"EMPTY"} : ans;
    }
}