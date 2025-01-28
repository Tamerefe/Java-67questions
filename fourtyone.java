import java.util.Scanner;

public class fourtyone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int digits = 0;
        while (number != 0) {
            digits += Math.pow(number % 10, 2);
            number /= 10;
        }

        System.out.println("Sum of digits square: " + digits);
        scanner.close();
    }
}
