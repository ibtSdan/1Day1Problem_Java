import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        for (int i = 0; i < text.length(); i++) {
            if (Character.isUpperCase(text.charAt(i))) {
                System.out.print(Character.toLowerCase(text.charAt(i)));
            } else {
                System.out.print(Character.toUpperCase(text.charAt(i)));
            }
        }
    }
}
