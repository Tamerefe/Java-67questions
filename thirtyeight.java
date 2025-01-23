import java.util.Scanner;
import java.util.Random;

public class thirtyeight {
    public static void main(String[] args) {
        Scanner sys = new Scanner(System.in);
        Random random = new Random();

        boolean keepPlaying = true;
        while (keepPlaying) {
            int randoms = random.nextInt(10);
            System.out.print("Enter a Number: ");
            int numb = sys.nextInt();

            System.out.println("The Number Was: " + randoms);

            if (numb == randoms) {
                System.out.println("Congratulations! You guessed the number!");
                keepPlaying = false;
            } else {
                System.out.println("Unlucky! Better luck next time. Press Enter to continue.");
                sys.nextLine();
                sys.nextLine(); 
            }
        }
        sys.close();
    }
}