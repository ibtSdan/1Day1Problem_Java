import java.util.Scanner;

import static java.lang.Math.abs;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(abs(scanner.nextLong() - scanner.nextLong()));
    }
}
