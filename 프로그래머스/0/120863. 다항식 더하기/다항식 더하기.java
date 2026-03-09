class Solution {
    public String solution(String polynomial) {
        int[] num = new int[2];
        String[] arr = polynomial.split(" ");
        for (String s : arr) {
            if (s.equals("+")) {
                continue;
            }
            if (isC(s)) {
                num[1] += calC(s);
            } else {
                num[0] += calX(s);
            }
        }
        
        if (num[0] == 0) {
            return num[1]+"";
        } else if (num[1] == 0) {
            if (num[0] == 1) {
                return "x";
            }
            return num[0]+"x";
        } else {
            if (num[0] == 1) {
                return "x + "+num[1];
            }
            return num[0]+"x + "+num[1];
        } 
    }
    
    public boolean isC(String s) {
        return !s.contains("x");
    }
    
    public int calC(String s) {
        return Integer.parseInt(s);
    }
    
    public int calX(String s) {
        if (s.equals("x")) {
            s = "1x";
        }
        return Integer.parseInt(s.substring(0, s.length()-1));
    }
}