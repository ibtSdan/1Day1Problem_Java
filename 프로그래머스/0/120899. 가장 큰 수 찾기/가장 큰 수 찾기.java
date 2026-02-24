class Solution {
    public int[] solution(int[] array) {
        int max = -1;
        int idx = 0;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                idx = i;
                max = array[i];
            }
        }
        return new int[] {max, idx};
    }
}