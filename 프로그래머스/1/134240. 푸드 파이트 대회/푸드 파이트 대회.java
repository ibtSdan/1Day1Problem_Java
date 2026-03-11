class Solution {
    public String solution(int[] food) {
        String s = "";
        for (int i = 1; i < food.length; i++) {
            for (int j = 0; j < food[i]/2; j++) {
                s += String.valueOf(i);
            }
        }
        StringBuilder sb = new StringBuilder(s);
        return s + "0" + sb.reverse().toString();
    }
}