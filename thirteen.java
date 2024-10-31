import java.util.Scanner;

public class thirteen {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter (3) number: ");

        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double num3 = scanner.nextDouble();

        if (num1 >= num2 && num1 >= num3) {
            if (num2 >= num3) {
                System.out.print(num1 + " > " + num2 + " > " + num3);
            } else {
                System.out.print(num1 + " > " + num3 + " > " + num2);
            }
        } else if (num2 >= num1 && num2 >= num3) {
            if (num1 >= num3) {
                System.out.print(num2 + " > " + num1 + " > " + num3);
            } else {
                System.out.print(num2 + " > " + num3 + " > " + num1);
            }
        } else {
            if (num1 >= num2) {
                System.out.print(num3 + " > " + num1 + " > " + num2);
            } else {
                System.out.print(num3 + " > " + num2 + " > " + num1);
            }
        }

        scanner.close();
    }
}
