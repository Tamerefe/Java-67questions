import java.util.Scanner;

public class fiftynine {

    static void powpow(int number1, int number2) {
        System.out.println("Product of the numbers = " + (number1 * number2));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();

        powpow(number1, number2);
        scanner.close();
    }
}