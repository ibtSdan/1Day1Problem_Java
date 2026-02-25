import java.util.*;

class Solution {
    static int[] delete;
    
    public int[] solution(int[] arr, int[] delete_list) {
        delete = delete_list;
        Arrays.sort(delete);
        
        ArrayList<Integer> A = new ArrayList<>();
        for (int i : arr) {
            if (!contain(i)) {
                A.add(i);
            }
        }
        int[] ans = new int[A.size()];
        for (int i = 0; i < A.size(); i++) {
            ans[i] = A.get(i);
        }
        return ans;
    }
    
    static boolean contain(int k) {
        int s = 0, e = delete.length-1;
        while (s <= e) {
            int mid = (s+e)/2;
            if (delete[mid] == k) {
                return true;
            } else if (delete[mid] > k) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return false;
    } 
}