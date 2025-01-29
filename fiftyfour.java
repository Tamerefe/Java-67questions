import java.util.Scanner;

public class fiftyfour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows (N): ");
        int N = scanner.nextInt();
        System.out.print("Enter the number of columns (M): ");
        int M = scanner.nextInt();

        int[][] array = new int[N][M];

        System.out.println("Enter " + (N * M) + " values for the " + N + "x" + M + " array:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print("Enter value for [" + i + "][" + j + "]: ");
                array[i][j] = scanner.nextInt();
            }
        }

        System.out.println("\nThe " + N + "x" + M + " array with row sums:");
        for (int i = 0; i < N; i++) {
            int rowSum = 0;
            for (int j = 0; j < M; j++) {
                System.out.print(array[i][j] + " ");
                rowSum += array[i][j];
            }
            System.out.println("| Sum: " + rowSum);
        }

        scanner.close();
    }
}
