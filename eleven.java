import java.util.Scanner;

public class eleven {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        double amount;
        double balance = 0.0;

        do {
            System.out.println("Bank Application Menu:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    amount = scanner.nextDouble();
                    if (amount > 0) {
                        balance += amount;
                        System.out.println("Amount deposited successfully.");
                    } else {
                        System.out.println("Invalid amount. Deposit should be positive.");
                    }
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    amount = scanner.nextDouble();
                    if (amount > 0 && amount <= balance) {
                        balance -= amount;
                        System.out.println("Amount withdrawn successfully.");
                    } else if (amount > balance) {
                        System.out.println("Insufficient balance.");
                    } else {
                        System.out.println("Invalid amount. Withdrawal should be positive.");
                    }
                    break;
                case 3:
                    System.out.println("Current balance: $" + balance);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }
}
