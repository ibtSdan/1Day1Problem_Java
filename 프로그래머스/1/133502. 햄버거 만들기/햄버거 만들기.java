class Solution {
    public int solution(int[] ingredient) {
        int ans = 0;
        int[] arr = new int [ingredient.length];
        int idx = 0;
        for (int i : ingredient) {
            arr[idx] = i;
            if (idx >= 3 && arr[idx] == 1 && arr[idx-1] == 3 && arr[idx-2] == 2 && arr[idx-3] == 1) {
                ans++;
                idx -= 3;
            } else {
                idx++;
            }
        }
        return ans;
    }
}