import java.util.Scanner;

public class thirtythree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("A perfect number is a positive integer that is equal to the sum of its proper divisors, excluding itself.");
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int sum = 0;

        // Find divisors and sum them
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0)
                sum += i;
        }

        if (sum == number)
            System.out.println(number + " is a Perfect Number.");
        else
            System.out.println(number + " is NOT a Perfect Number.");
        scanner.close();
    }
}
