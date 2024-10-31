import java.util.Scanner;

public class ten {

    public static void main(String[] args) {

        Scanner sys = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        float num1 = sys.nextFloat();
        float num2 = sys.nextFloat();

        System.out.print("Choose an operation (+, -, x, /): ");
        char operation = sys.next().charAt(0);

        switch (operation) {
            case '+':
                System.out.printf("%.2f + %.2f = %.2f\n", num1, num2, (num1 + num2));
                break;
            case '-':
                System.out.printf("%.2f - %.2f = %.2f\n", num1, num2, (num1 - num2));
                break;
            case 'x':
            case '*':
                System.out.printf("%.2f x %.2f = %.2f\n", num1, num2, (num1 * num2));
                break;
            case '/':
                if (num2 != 0) {
                    System.out.printf("%.2f / %.2f = %.2f\n", num1, num2, (num1 / num2));
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid operation. Please choose +, -, x, or /.");
                break;
        }

        sys.close();
    }
}
