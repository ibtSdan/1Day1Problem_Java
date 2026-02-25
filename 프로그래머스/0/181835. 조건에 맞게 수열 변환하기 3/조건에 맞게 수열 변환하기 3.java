class Solution {
    public int[] solution(int[] arr, int k) {
        int[] ans = new int[arr.length];
        if (k%2 == 0) {
            for (int i = 0; i < arr.length; i++) {
                ans[i] = arr[i]+k;
            }
        } else {
            for (int i = 0; i < arr.length; i++) {
                ans[i] = arr[i]*k;
            }
        }
        return ans;
    }
}