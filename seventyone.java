import java.util.Scanner;

public class seventyone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the current temperature (°C): ");
        int temperature = scanner.nextInt();

        if (temperature >= 30) {
            System.out.println("It's quite hot! How about going to the beach or a water park?");
        } else if (temperature >= 20) {
            System.out.println("Nice weather! A picnic or outdoor sports would be great.");
        } else if (temperature >= 10) {
            System.out.println("A bit chilly. Maybe visit a museum or go to a café.");
        } else {
            System.out.println("Cold outside! How about watching a movie or going to a cozy indoor event?");
        }

        scanner.close();
    }
}
