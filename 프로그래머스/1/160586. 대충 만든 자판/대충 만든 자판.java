class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] ans = new int[targets.length];
        int index = 0;
        for (String target : targets) {
            int cnt = 0;
            for (int i = 0; i < target.length(); i++) {
                String t = target.substring(i, i+1);
                int min = Integer.MAX_VALUE;
                for (int j = 0; j < keymap.length; j++) {
                    int idx = keymap[j].indexOf(t);
                    if (idx != -1) {
                        min = Math.min(min, idx);
                    }
                }
                if (min != Integer.MAX_VALUE) {
                    cnt += min + 1;
                } else {
                    cnt = 0;
                    break;
                }
            }
            ans[index++] = cnt == 0 ? -1 : cnt;
        }
        return ans;
    }
}