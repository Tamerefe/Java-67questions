import java.util.Scanner;

public class seventyfive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your weight (kg): ");
        double weight = scanner.nextDouble();

        System.out.print("Enter your height (m): ");
        double height = scanner.nextDouble();

        double bmi = weight / (height * height);

        String category;
        if (bmi < 18.5) {
            category = "Underweight";
        } else if (bmi < 24.9) {
            category = "Normal weight";
        } else if (bmi < 29.9) {
            category = "Overweight";
        } else {
            category = "Obese";
        }

        System.out.printf("\nYour BMI: %.2f\n", bmi);
        System.out.println("Category: " + category);

        scanner.close();
    }
}
