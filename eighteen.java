import java.util.Scanner;

public class eighteen {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int factorial = 1;

        for (int i = 1; i <= number; i++) {
            System.out.print(i + ") ");
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
                if (j < i) {
                    System.out.print(" * ");
                }
            }
            factorial *= i;
            System.out.println(" = " + factorial);
        }

        scanner.close();
    
    }

}
