import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int king = scanner.nextInt();
        if (king != 1) {
            System.out.print((1-king) + " ");
        } else System.out.print(0+ " ");
        int q = scanner.nextInt();
        if (q != 1) {
            System.out.print((1-q) + " ");
        } else System.out.print(0+ " ");
        int l = scanner.nextInt();
        if (l != 2) {
            System.out.print((2 - l) + " ");
        } else System.out.print(0+ " ");
        int v = scanner.nextInt();
        if (v != 2) {
            System.out.print((2 - v) + " ");
        } else System.out.print(0+ " ");
        int n = scanner.nextInt();
        if (n != 2) {
            System.out.print((2-n)+" ");
        } else System.out.print(0+" ");
        int p = scanner.nextInt();
        if (p != 8) {
            System.out.println((8 - p)+" ");
        } else System.out.println(0);
    }
}
