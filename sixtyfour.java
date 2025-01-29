import java.util.Scanner;

public class sixtyfour {

    public static double power(int x, int y) {
        return Math.pow(x, y);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base number (x): ");
        int x = scanner.nextInt();

        System.out.print("Enter the exponent (y): ");
        int y = scanner.nextInt();

        double result = power(x, y);
        System.out.println(x + "^" + y + " = " + result);

        scanner.close();
    }
}
