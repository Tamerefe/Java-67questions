import java.util.Scanner;

public class two {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the two edges of the rectangle: ");
        double edge1 = scanner.nextDouble();
        double edge2 = scanner.nextDouble();

        double perimeter = 2 * (edge1 + edge2);
        double area = edge1 * edge2;

        System.out.println("Perimeter: " + perimeter + "\nArea: " + area);

        scanner.close();
    }

}
