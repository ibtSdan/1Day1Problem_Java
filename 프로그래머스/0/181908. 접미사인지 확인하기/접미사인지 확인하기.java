class Solution {
    public int solution(String my_string, String is_suffix) {
        boolean check = false;
        for (int i = 0; i < my_string.length(); i++) {
            String suffix = my_string.substring(i,my_string.length());
            if (suffix.equals(is_suffix)) {
                check = true;
                break;
            }
        }
        if (check) {
            return 1;
        } else {
            return 0;
        }
    }
}