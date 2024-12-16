import java.util.Scanner;

public class twentyfour {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int one = scanner.nextInt();
        System.out.print("Enter a second number: ");
        int two = scanner.nextInt();

        System.out.println("GCD of " + one + " and " + two + " is " + findGCD(one, two));

        scanner.close();
    }

    public static int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return findGCD(b, a % b);
    }
}
