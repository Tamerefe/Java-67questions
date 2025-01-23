import java.util.Scanner;

public class thirtynine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int digits = 0;
        while (number != 0) {
            number /= 10;
            digits++;
        }

        System.out.println("Number of digits: " + digits);
        scanner.close();
    }
}
