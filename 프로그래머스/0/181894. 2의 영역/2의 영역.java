import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int left = findL(arr);
        int right = findR(arr);
        if (left == -1 || right == -1) {
            return new int[] {-1};
        } else {
            return Arrays.copyOfRange(arr, left, right+1);
        }
    }
    
    public int findL(int[] arr) {
        int idx = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                return i;
            }
        }
        return idx;
    }
    
    public int findR(int[] arr) {
        int idx = -1;
        for (int i = arr.length-1; i >= 0; i--) {
            if (arr[i] == 2) {
                return i;
            }
        }
        return idx;
    }
}