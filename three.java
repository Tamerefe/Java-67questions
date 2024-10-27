import java.util.Scanner;

public class three {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the distance traveled (km): ");
        double km = scanner.nextDouble();
        System.out.print("Enter the time you want to go;\nHours: ");
        double hour = scanner.nextDouble();
        System.out.print("Minute: ");
        double minute = scanner.nextDouble();

        minute = minute/60;
        double arrival = km/(hour+minute);

        System.out.println("The average speed at which you should go:  " + arrival + " km/h");

        scanner.close();
    }

}
