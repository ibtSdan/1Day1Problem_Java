class Solution {
    public int[] solution(int[] arr, int n) {
        int[] ans = new int[arr.length];
        if (arr.length%2 == 0) {
            for (int i = 0; i < arr.length; i++) {
                if (i%2 == 0) {
                    ans[i] = arr[i];
                } else {
                    ans [i] = arr[i] + n;
                }
            }
        } else {
            for (int i = 0; i < arr.length; i++) {
                if (i%2 == 0) {
                    ans[i] = arr[i] + n;
                } else {
                    ans[i] = arr[i];
                }
            }
        }
        return ans;
    }
}