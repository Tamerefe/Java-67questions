import java.util.Scanner;

public class fourtyfive {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter a number: ");
            array[i] = scanner.nextInt();
        }

        System.out.println("Array elements are:");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        
        scanner.close();
    }

}
