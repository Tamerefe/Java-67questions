import java.util.Scanner;

public class eight {

    public static void main(String[] args) {

        Scanner sys = new Scanner(System.in);

        System.out.print("Enter your weight (kg): ");
        float weight = sys.nextFloat();

        System.out.print("Enter your height (m): ");
        float height = sys.nextFloat();

        float bmi = weight / (height * height);

        if (bmi < 18.5) {
            System.out.println("You are Weak");
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("You are in the Optimum Range");
        } else if (bmi >= 25 && bmi <= 29.9) {
            System.out.println("You are Overweight");
        } else if (bmi >= 30 && bmi <= 34.9) {
            System.out.println("Class I Obesity");
        } else if (bmi >= 35 && bmi <= 39.9) {
            System.out.println("Class II Obesity");
        } else if (bmi >= 40) {
            System.out.println("Class III Obesity");
        }

        sys.close();
    }
}
