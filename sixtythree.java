import java.util.Scanner;

public class sixtythree {

    // Method to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void printPrimesInRange(int start, int end) {
        System.out.println("Prime numbers between " + start + " and " + end + ":");
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start, end;

        while (true) {
            System.out.print("Enter the starting number: ");
            start = scanner.nextInt();

            System.out.print("Enter the ending number: ");
            end = scanner.nextInt();

            if (end > start) {
                break;
            } else {
                System.out.println("Ending number must be greater than starting number. Please try again.");
            }
        }

        printPrimesInRange(start, end);

        scanner.close();
    }
}
