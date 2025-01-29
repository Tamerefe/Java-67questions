import java.util.Scanner;

public class sixtyfive {

    public static int countLetterInSentence(String sentence, char letter) {
        int count = 0;

        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == letter) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        System.out.print("Enter a letter to count: ");
        char letter = scanner.next().charAt(0);

        int result = countLetterInSentence(sentence, letter);
        System.out.println("The letter '" + letter + "' appears " + result + " times in the sentence.");

        scanner.close();
    }
}
