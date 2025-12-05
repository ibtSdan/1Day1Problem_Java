import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ans = 0;
        for (int i = 0; i < 5; i++) {
            int n = scanner.nextInt();
            ans += n*n%10;
        }
        System.out.println(ans%10);
    }
}
