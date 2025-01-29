import java.util.Scanner;

public class sixtyone {

    public static void factorial(int number) {
        int factorial = 1;

        for (int i = 1; i <= number; i++) {
            System.out.print(i + ") ");
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
                if (j < i) {
                    System.out.print(" * ");
                }
            }
            factorial *= i;
            System.out.println(" = " + factorial);
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        factorial(number);

        scanner.close();

    }

}
