import java.util.Scanner;

public class twentyone {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int three = scanner.nextInt();

        if (three % 3 == 0) {
            System.out.println("The number is a multiple of 3");
        } else {
            System.out.println("The number is a multiple of 3");
        } 

        scanner.close();
    }

}
