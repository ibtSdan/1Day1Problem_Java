import java.util.*;

class Solution {
    public String solution(int[] numbers, String hand) {
        Map<Character, int[]> map = new HashMap<>();
        map.put('1', new int[]{0,0});
        map.put('2', new int[]{0,1});
        map.put('3', new int[]{0,2});
        map.put('4', new int[]{1,0});
        map.put('5', new int[]{1,1});
        map.put('6', new int[]{1,2});
        map.put('7', new int[]{2,0});
        map.put('8', new int[]{2,1});
        map.put('9', new int[]{2,2});
        map.put('0', new int[]{3,1});
        map.put('*', new int[]{3,0});
        map.put('#', new int[]{3,2});
        String ans = "";
        char right = '#', left = '*';
        for (int n : numbers) {
            if (n == 1 || n == 4 || n == 7) {
                ans += "L";
                left = (char)(n+'0');
            } else if (n == 3 || n == 6 || n == 9) {
                ans += "R";
                right = (char)(n+'0');
            } else {
                int[] left_idx = map.get(left);
                int[] right_idx = map.get(right);
                int[] target = map.get((char)(n+'0'));
                int le = Math.abs(left_idx[0]-target[0]) + Math.abs(left_idx[1]-target[1]);
                int ri = Math.abs(right_idx[0]-target[0]) + Math.abs(right_idx[1]-target[1]);
                if (le < ri) {
                    ans += "L";
                    left = (char)(n+'0');
                } else if (le > ri) {
                    ans += "R";
                    right = (char)(n+'0');
                } else {
                    if (hand.equals("right")) {
                        ans += "R";
                        right = (char)(n+'0');
                    } else {
                        ans += "L";
                        left = (char)(n+'0');
                    }
                }
            }
        }
        return ans;
    }
}