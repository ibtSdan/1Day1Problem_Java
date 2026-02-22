class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] result = new int[num2-num1+1];
        for (int i = 0; i <= num2-num1; i++) {
            result[i] = numbers[i+num1];
        }
        return result;
    }
}