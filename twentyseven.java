import java.util.Scanner;
import java.util.Random;

public class twentyseven {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = 0;

        for (int i = 1; i < 11; i++) {
            randomNumber += 50 + random.nextInt(51);
        }
        System.out.println("Average of 10 random numbers between 50 and 100 is: " + randomNumber / 10);

        scanner.close();
    }
}