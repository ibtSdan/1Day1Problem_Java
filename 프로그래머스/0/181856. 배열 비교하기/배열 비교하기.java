class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int an = arr1.length;
        int bn = arr2.length;
        if (an > bn) {
            return 1;
        } else if (an < bn) {
            return -1;
        } else {
            int asum = 0;
            int bsum = 0;
            for (int i = 0; i < an; i++) {
                asum += arr1[i];
                bsum += arr2[i];
            }
            if (asum > bsum) {
                return 1;
            } else if (asum < bsum) {
                return -1;
            } else {
                return 0;
            }
        }
    }
}