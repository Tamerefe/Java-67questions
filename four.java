import java.util.Scanner;

public class four {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // KDV = %18
        System.out.print("Enter the product price: ");
        double product = scanner.nextDouble();

        double kdv = product*0.18; 

        System.out.printf("Price of the product without VAT: %.2f",(product-kdv));
        System.out.printf("\nPrice of VAT: %.2f", kdv);

        scanner.close();
    }

}
