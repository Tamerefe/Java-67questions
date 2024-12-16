import java.util.Scanner;

public class twentyfive {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int one = scanner.nextInt();
        System.out.print("Enter a second number: ");
        int two = scanner.nextInt();

        scanner.close();

        System.out.println("The LCM of " + one + " and " + two + " is " + findLCM(one, two));
    }

    public static int findLCM(int a, int b) {
        return (a * b) / findGCD(a, b);
    }

    public static int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return findGCD(b, a % b);
    }
}
