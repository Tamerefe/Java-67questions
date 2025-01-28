import java.util.Scanner;

public class fourtyseven {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        int largest = array[0];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter a number: ");
            array[i] = scanner.nextInt();
            if (array[i] > largest) {
                largest = array[i];
            }
        }

        System.out.println("Largest: " + largest);
        scanner.close();
    }

}
