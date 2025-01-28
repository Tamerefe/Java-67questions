import java.util.Scanner;

public class fourtytwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int digits = 0;
        while (number != 0) {
            digits = number % 10;
            number /= 10;
            System.out.print(digits);
        }

        scanner.close();
    }
}
