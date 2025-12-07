import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        for (long i = n; i > 0; i--) {
            System.out.println(i);
        }
    }
}
