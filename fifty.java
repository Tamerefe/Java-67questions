import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class fifty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];
        System.out.print("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        ArrayList<Integer> oddNumbers = new ArrayList<>();
        ArrayList<Integer> evenNumbers = new ArrayList<>();

        for (int num : numbers) {
            if (num % 2 == 1) {
                oddNumbers.add(num);
            } else {
                evenNumbers.add(num);
            }
        }

        // Convert ArrayList to array if needed
        int[] oddArray = oddNumbers.stream().mapToInt(i -> i).toArray();

        System.out.println("Odd Numbers: " + Arrays.toString(oddArray));
        scanner.close();
    }
}
