import java.util.Scanner;

public class seventythree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your SMS message: ");
        String message = scanner.nextLine();

        boolean isUnicode = !message.matches("[\\x20-\\x7E\\n\\r]*");

        int messageLength = message.length();
        int maxCharsPerMessage = isUnicode ? 70 : 160;
        int maxCharsPerPart = isUnicode ? 67 : 153;
        int messageParts;

        if (messageLength <= maxCharsPerMessage) {
            messageParts = 1;
        } else {
            messageParts = (int) Math.ceil((double) messageLength / maxCharsPerPart);
        }

        System.out.println("\n--- SMS Size Calculation ---");
        System.out.println("Message Length: " + messageLength + " characters");
        System.out.println("Encoding Type: " + (isUnicode ? "Unicode (70 char limit)" : "GSM (160 char limit)"));
        System.out.println("Number of SMS Parts: " + messageParts);

        scanner.close();
    }
}
