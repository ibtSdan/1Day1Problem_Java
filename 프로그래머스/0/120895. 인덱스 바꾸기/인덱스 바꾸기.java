class Solution {
    public String solution(String my_string, int num1, int num2) {
        String result = "";
        for (int i = 0; i < my_string.length(); i++) {
            if (i == num1) {
                result += my_string.charAt(num2);
            } else if (i == num2) {
                result += my_string.charAt(num1);
            } else {
                result += my_string.charAt(i);
            }
        }
        return result;
    }
}