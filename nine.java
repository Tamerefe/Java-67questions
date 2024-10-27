import java.util.Scanner;

public class nine {

    public static void main(String[] args) {

        Scanner sys = new Scanner(System.in);

        System.out.print("Enter (2) numbers: ");
        float num1 = sys.nextFloat();
        float num2 = sys.nextFloat();

        System.out.print("1) +\n2) -\n3) x\n4) /\n");
        System.out.print("Enter operation number: ");
        int ope = sys.nextInt();

        if (ope == 1) {
            System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
        } else if (ope == 2) {
            System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        } else if (ope == 3) {
            System.out.println(num1 + " x " + num2 + " = " + (num1 * num2));
        } else if (ope == 4) {
            System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
        } 

        sys.close();
    }
}
