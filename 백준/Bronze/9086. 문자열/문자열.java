import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int i = 0; i < T; i++) {
            String s = scanner.next();
            System.out.println(s.substring(0,1)+s.substring(s.length()-1));
        }
    }
}
