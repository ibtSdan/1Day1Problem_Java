class Solution {
    static int n;
    public String[] solution(int num, int[] arr1, int[] arr2) {
        n = num;
        String[] ans = new String[n];
        for (int i = 0; i < n; i++) {
            String a = con(arr1[i]);
            String b = con(arr2[i]);
            String temp = "";
            for (int j = 0; j < n; j++) {
                if (a.charAt(j) == '0' && b.charAt(j) == '0') {
                    temp += " ";
                } else {
                    temp += "#";
                }
            }
            ans[i] = temp;
        }
        return ans;
    }
    
    public String con(int v) {
        String temp = Integer.toString(v, 2);
        while (temp.length() != n) {
            temp = "0" + temp;
        }
        return temp;
    }
}