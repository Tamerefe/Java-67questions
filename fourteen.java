import java.util.Scanner;

public class fourteen {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Midterm Exam Score: ");
        double midterm = scanner.nextDouble();
        System.out.print("Enter Final Exam Score: ");
        double finall = scanner.nextDouble();
        System.out.print("Enter Midterm and Final Exam Percentage: ");
        double perc = scanner.nextDouble();
        double perc2 = scanner.nextDouble();

        if (perc + perc2 != 100) {
            System.out.print("Invalid Percentage");
        } else {
            double score = (midterm * (perc / 100)) + (finall * (perc2 / 100));
            System.out.print("Score: " + score + " Grade: ");
            if (score >= 80 && score <= 100) {
                System.out.print("A");
            } else if (score >= 70) {
                System.out.print("B");
            } else if (score >= 60) {
                System.out.print("C");
            } else if (score >= 50) {
                System.out.print("D");
            } else {
                System.out.print("F");
            }
        }

        scanner.close();
    }
}
