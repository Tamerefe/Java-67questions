import java.util.Scanner;
import java.util.Random;

public class twentysix {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("10 Random numbers between 200 and 1000");

        for (int i = 1; i < 11; i++) {
            int randomNumber = 200 + random.nextInt(801);
            System.out.println(i + ") " + randomNumber);
        }

        scanner.close();
    }
}