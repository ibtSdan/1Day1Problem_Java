import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int []data = {1,1,2,2,2,8};

        for (int i = 0; i<6; i++) {
            System.out.print(data[i] - scanner.nextInt() + " ");
        }
    }
}
