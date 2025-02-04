import java.util.Scanner;
import java.util.Random;

public class seventysix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] wordList = { "java", "python", "hangman", "developer", "keyboard", "programming" };

        Random random = new Random();
        String wordToGuess = wordList[random.nextInt(wordList.length)];
        char[] guessedWord = new char[wordToGuess.length()];
        boolean[] guessedLetters = new boolean[26];

        for (int i = 0; i < guessedWord.length; i++) {
            guessedWord[i] = '_';
        }

        int attempts = 7;

        System.out.println("Welcome to Hangman!");

        while (attempts > 0) {
            System.out.println("\nWord: " + String.valueOf(guessedWord));
            System.out.println("Attempts left: " + attempts);
            System.out.print("Enter a letter: ");
            char guess = scanner.next().toLowerCase().charAt(0);

            if (!Character.isLetter(guess) || guessedLetters[guess - 'a']) {
                System.out.println("Invalid input or already guessed. Try again.");
                continue;
            }

            guessedLetters[guess - 'a'] = true;
            boolean correctGuess = false;

            for (int i = 0; i < wordToGuess.length(); i++) {
                if (wordToGuess.charAt(i) == guess) {
                    guessedWord[i] = guess;
                    correctGuess = true;
                }
            }

            if (!correctGuess) {
                attempts--;
                System.out.println("Wrong guess!");
                drawStickFigure(7 - attempts);
            }

            if (String.valueOf(guessedWord).equals(wordToGuess)) {
                System.out.println("\nCongratulations! You guessed the word: " + wordToGuess);
                return;
            }
        }

        System.out.println("\nGame Over! The word was: " + wordToGuess);
        scanner.close();
    }

    private static void drawStickFigure(int mistakes) {
        switch (mistakes) {
            case 1:
                System.out.println(" O ");
                break;
            case 2:
                System.out.println(" O ");
                System.out.println(" | ");
                break;
            case 3:
                System.out.println(" O ");
                System.out.println(" | ");
                System.out.println("/ ");
                break;
            case 4:
                System.out.println(" O ");
                System.out.println(" | ");
                System.out.println("/ \\ ");
                break;
            case 5:
                System.out.println(" O ");
                System.out.println(" | ");
                System.out.println("/|\\ ");
                break;
            case 6:
                System.out.println(" O ");
                System.out.println(" | ");
                System.out.println("/|\\ ");
                System.out.println("/ ");
                break;
            case 7:
                System.out.println(" O ");
                System.out.println(" | ");
                System.out.println("/|\\ ");
                System.out.println("/ \\ ");
                break;
            default:
                break;
        }
    }
}
