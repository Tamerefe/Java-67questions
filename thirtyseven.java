import java.util.Scanner;

public class thirtyseven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter second number: ");
        int b = scanner.nextInt();

        int result = 0;
        for (int i = 0; i < b; i++) {
            result += a;
        }

        System.out.println("Result of multiplication: " + result);
        scanner.close();
    }
}
