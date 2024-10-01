import java.util.Scanner;

public class one {
    
    public static void main(String[] args) {

        double pi = Math.PI;

        Scanner diameter = new Scanner(System.in); // Create a Scanner object
        System.out.print("Enter a circle: ");

        float userInp = diameter.nextFloat(); // Read user input
        
        double circle = 2 * pi * userInp;

        System.out.println("Circumference: " + circle);
        diameter.close();
    }

}
