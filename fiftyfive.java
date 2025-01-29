import java.util.Scanner;

public class fiftyfive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        System.out.print("Which character do you want to count? ");
        char targetChar = scanner.next().charAt(0);

        int count = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == targetChar) {
                count++;
            }
        }

        System.out.println("\nThe character '" + targetChar + "' appears " + count + " times in the sentence.");

        scanner.close();
    }
}
