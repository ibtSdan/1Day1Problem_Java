class Solution {
    public int solution(int[] arr) {
        int ans = 0;
        while (true) {
            int[] brr = new int[arr.length];
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= 50 && arr[i] % 2 == 0) {
                    brr[i] = arr[i]/2;
                } else if (arr[i] < 50 && arr[i] % 2 != 0) {
                    brr[i] = arr[i]*2+1;
                } else {
                    brr[i] = arr[i];
                }
            }
            boolean check = true;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != brr[i]) {
                    check = false;
                    break;
                }
            }
            if (check) {
                return ans;
            }
            ans++;
            arr = brr;
        }
    }
}