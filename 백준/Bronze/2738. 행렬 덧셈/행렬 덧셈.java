import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[][] data = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j<m; j++) {
                data[i][j] += scanner.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j<m; j++) {
                data[i][j] += scanner.nextInt();
            }
        }
        for(int i = 0; i<n; i++) {
            for (int j=0; j<m; j++) {
                System.out.print(data[i][j]+" ");
            }
            System.out.println();
        }
    }
}
