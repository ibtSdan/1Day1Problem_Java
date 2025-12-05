import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            long a = scanner.nextLong();
            long b = scanner.nextLong();
            if (a==0 && b==0) {
                break;
            }
            System.out.println(a > b? "Yes" : "No");
        }
    }
}
