import java.util.Scanner;

public class thirtyfour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (N): ");
        int n = scanner.nextInt();

        System.out.println("Prime numbers up to " + n + ":");
        int num = 2;
        while (num <= n) {
            if (isPrime(num))
                System.out.print(num + " ");
            num++;
        }
        scanner.close();
    }

    public static boolean isPrime(int number) {
        if (number < 2)
            return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }
}
