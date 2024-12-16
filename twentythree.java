import java.util.Scanner;

public class twentythree {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int ft = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int ft2 = scanner.nextInt();

        System.out.println("Numbers divisible by 3 between " + ft + " and " + ft2 + ":");
        for (int i = Math.min(ft, ft2); i <= Math.max(ft, ft2); i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }

        System.out.println("Numbers divisible by 5 between " + ft + " and " + ft2 + ":");
        for (int i = Math.min(ft, ft2); i <= Math.max(ft, ft2); i++) {
            if (i % 5 == 0) {
                System.out.println(i);
            }
        }

        scanner.close();
    }

}
