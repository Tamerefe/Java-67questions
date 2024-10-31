import java.util.Scanner;

public class nineteen {
    
    public static void main(String[] args) {
            
            Scanner scanner = new Scanner(System.in);
        
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();	
            double average = 0;
    
            for (int i = 1; i <= number; i++) {
                average += i;
            }
            
            System.out.print("Average: " + average/number);
            scanner.close();
    }
}
