import java.util.Scanner;

public class fourtynine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter a number: ");
            array[n - i - 1] = scanner.nextInt();
        }

        System.out.println("Array reverse elements are:");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        scanner.close();
    }

}
