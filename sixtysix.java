import java.util.Scanner;

public class sixtysix {

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static int sum(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[4];

        for (int i = 2; i <= 4; i++) {
            System.out.print("Enter " + i + " numbers: ");
            for (int j = 0; j < i; j++) {
                numbers[j] = scanner.nextInt();
            }
            if (i == 2) {
                System.out.println(numbers[0] + " + " + numbers[1] + " = " + sum(numbers[0], numbers[1]));
            } else if (i == 3) {
                System.out.println(numbers[0] + " + " + numbers[1] + " + " + numbers[2] + " = "
                        + sum(numbers[0], numbers[1], numbers[2]));
            } else {
                System.out.println(numbers[0] + " + " + numbers[1] + " + " + numbers[2] + " + " + numbers[3] + " = "
                        + sum(numbers[0], numbers[1], numbers[2], numbers[3]));
            }
        }

        scanner.close();
    }
}
