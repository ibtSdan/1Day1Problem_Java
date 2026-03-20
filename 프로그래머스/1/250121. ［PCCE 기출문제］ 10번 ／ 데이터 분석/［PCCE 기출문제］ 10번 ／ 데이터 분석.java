import java.util.*;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        Map<String, Integer> map = new HashMap<>();
        map.put("code", 0);
        map.put("date", 1);
        map.put("maximum", 2);
        map.put("remain", 3);
        ArrayList<Integer[]> A = new ArrayList<>();
        for (int[] dat : data) {
            if (dat[map.get(ext)] < val_ext) {
                Integer[] temp = make(dat);
                A.add(temp);
            }
        }
        Collections.sort(A, (a, b) -> {
            return a[map.get(sort_by)] - b[map.get(sort_by)];
        });
        int[][] ans = new int[A.size()][4];
        for (int i = 0; i < A.size(); i++) {
            for (int j = 0; j < 4; j++) {
                ans[i][j] = A.get(i)[j];
            }
        }
        return ans;
    }
    
    public Integer[] make(int[] arr) {
        Integer[] temp = new Integer[arr.length];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        return temp;
    }
}