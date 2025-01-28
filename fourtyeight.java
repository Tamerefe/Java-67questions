import java.util.Scanner;

public class fourtyeight {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter a number: ");
            array[i] = scanner.nextInt();
        }

        int largest = array[0];
        int smallest = array[0];
        for (int i = 1; i < n; i++) {
            if (array[i] > largest) {
                largest = array[i];
            }
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }

        System.out.println("Largest - Smallest: " + (largest - smallest));
        scanner.close();
    }

}
