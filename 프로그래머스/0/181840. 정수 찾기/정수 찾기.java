import java.util.*;

class Solution {
    static int[] num;
    
    public int solution(int[] num_list, int n) {
        num = num_list;
        Arrays.sort(num);
        boolean ans = search(n);
        return ans ? 1 : 0;
    }
    
    public boolean search(int n) {
        int s = 0, e = num.length-1;
        while (s <= e) {
            int mid = (s+e)/2;
            if (num[mid] == n) {
                return true;
            } else if (num[mid] > n) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return false;
    }
}