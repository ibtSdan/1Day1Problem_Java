import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        int i = scanner.nextInt();
        System.out.println(text.charAt(i-1));
    }
}
