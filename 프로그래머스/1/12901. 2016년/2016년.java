class Solution {
    public String solution(int a, int b) {
        String[] days = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
        int idx = 0;
        if (a == 1 || a == 4 || a == 7) { // 금요일
            idx = (4+b)%7;
        } else if (a == 2 || a == 8) { // 월요일
            idx = b%7;
        } else if (a == 3 || a == 11) { // 화요일
            idx = (1+b)%7;
        } else if (a == 4 || a == 6) { // 수요일
            idx = (2+b)%7;
        } else if (a == 5) { // 일요일
            idx = (b-1)%7;
        } else if (a == 9 || a == 12) { // 목요일
            idx = (3+b)%7;
        } else if (a == 10) { //토요일
            idx = (5+b)%7;
        }
        return days[idx];        
    }
}