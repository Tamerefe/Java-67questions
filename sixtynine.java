import java.util.Scanner;

public class sixtynine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of side a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter the length of side b: ");
        double b = scanner.nextDouble();

        System.out.println("The hypotenuse is: " + Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)));

        scanner.close();
    }
}
