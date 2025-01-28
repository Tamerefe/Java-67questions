import java.util.Scanner;

public class fourty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int digits = 0;
        while (number != 0) {
            digits += number % 10;
            number /= 10;
        }

        System.out.println("Sum of digits: " + digits);
        scanner.close();
    }
}
