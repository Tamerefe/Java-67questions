import java.util.Scanner;

public class seventyfour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number (n): ");
        int n = scanner.nextInt();

        double harmonicSum = 0.0;
        for (int i = 1; i <= n; i++) {
            harmonicSum += 1.0 / i;
        }

        System.out.println("Harmonic Series Sum (H" + n + "): " + harmonicSum);

        scanner.close();
    }
}
