import java.util.Scanner;

public class sixtyeight {

    public static void main(String[] args) {
        Scanner sys = new Scanner(System.in);

        String[] products = { "Cucumber", "Apple", "Orange", "Tomato", "Eggplant" };
        double[] prices = { 3.14, 4.11, 2.22, 0.95, 7.00 };
        int vat = 18;

        System.out.println("Products:");
        for (int i = 0; i < products.length; i++) {
            System.out.println((i + 1) + ". " + products[i] + " : " + prices[i] + " TL");
        }

        System.out.print("Select a product (1-5): ");
        int productIndex = sys.nextInt() - 1;

        System.out.print("How many kilograms do you want to buy? ");
        double weight = sys.nextDouble();

        double productPrice = prices[productIndex] * weight;
        double vatAmount = productPrice * vat / 100;
        double totalPrice = productPrice + vatAmount;

        System.out.println("Product you bought: " + products[productIndex]);
        System.out.println("Base product price: " + productPrice + " TL");
        System.out.println("VAT: " + vatAmount + " TL");
        System.out.println("Total price: " + totalPrice + " TL");

        sys.close();
    }
}
