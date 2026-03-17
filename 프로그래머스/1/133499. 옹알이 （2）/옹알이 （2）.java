class Solution {
    public int solution(String[] babbling) {
        int ans = 0;
        for (String b : babbling) {
            String last = "";
            while (true) {
                if (b.length() < 2) {
                    break;
                }
                if (b.substring(0, 2).equals("ma")) {
                    if (last.equals("ma")) {
                        break;
                    }
                    last = "ma";
                    b = b.substring(2, b.length());
                } else if (b.substring(0, 2).equals("ye")) {
                    if (last.equals("ye")) {
                        break;
                    }
                    last = "ye";
                    b = b.substring(2, b.length());
                } else if (b.length() > 2 && b.substring(0, 3).equals("woo")) {
                    if (last.equals("woo")) {
                        break;
                    }
                    last = "woo";
                    b = b.substring(3, b.length());
                } else if (b.length() > 2 && b.substring(0, 3).equals("aya")) {
                    if (last.equals("aya")) {
                        break;
                    }
                    last = "aya";
                    b = b.substring(3, b.length());
                } else {
                    break;
                }
            }
            if (b.equals("")) {
                ans++;
            }
        }
        return ans;
    }
}