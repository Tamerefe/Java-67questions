import java.util.Scanner;

public class fourtysix {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        int sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Enter a number: ");
            array[i] = scanner.nextInt();
            sum += array[i];
        }

        double average = (double) sum / array.length;

        System.out.println("Average: " + average);
        scanner.close();
    }

}
