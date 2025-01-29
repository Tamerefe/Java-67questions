import java.util.Arrays;
import java.util.Scanner;

public class fiftyseven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];

        System.out.print("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        Arrays.sort(numbers);

        System.out.println("Sorted array in ascending order: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        scanner.close();
    }
}
