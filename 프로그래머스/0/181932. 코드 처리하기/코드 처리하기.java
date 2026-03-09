class Solution {
    public String solution(String code) {
        String ret = "";
        int mode = 0;
        for (int idx = 0; idx <= code.length() - 1; idx++) {
            System.out.print(code.substring(idx, idx+1));
            if (mode == 0) {
                if (!code.substring(idx, idx+1).equals("1")) {
                    if (idx%2 == 0) {
                        ret += code.substring(idx, idx+1);
                    }
                } else {
                    mode = 1;
                }
            } else {
                if (!code.substring(idx, idx+1).equals("1")) {
                    if (idx%2 == 1) {
                        ret += code.substring(idx, idx+1);
                    }
                } else {
                    mode = 0;
                }
            }
        }
        return ret.equals("") ? "EMPTY" : ret;
    }
}