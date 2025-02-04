import java.util.Scanner;

public class seventytwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Find Chinese Zodiac sign");
            System.out.println("2. Find Horoscope sign");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    findChineseZodiac(scanner);
                    break;
                case 2:
                    findHoroscope(scanner);
                    break;
                case 3:
                    System.out.println("Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void findChineseZodiac(Scanner scanner) {
        System.out.print("Enter your birth year: ");
        int year = scanner.nextInt();
        String zodiac;
        switch (year % 12) {
            case 0:
                zodiac = "Monkey";
                break;
            case 1:
                zodiac = "Rooster";
                break;
            case 2:
                zodiac = "Dog";
                break;
            case 3:
                zodiac = "Pig";
                break;
            case 4:
                zodiac = "Rat";
                break;
            case 5:
                zodiac = "Ox";
                break;
            case 6:
                zodiac = "Tiger";
                break;
            case 7:
                zodiac = "Rabbit";
                break;
            case 8:
                zodiac = "Dragon";
                break;
            case 9:
                zodiac = "Snake";
                break;
            case 10:
                zodiac = "Horse";
                break;
            case 11:
                zodiac = "Goat";
                break;
            default:
                zodiac = "Unknown";
        }
        System.out.println("\nYour Chinese Zodiac sign is: " + zodiac);
    }

    private static void findHoroscope(Scanner scanner) {
        System.out.print("Enter your birth month (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Enter your birth day: ");
        int day = scanner.nextInt();
        String horoscope = "";
        if ((month == 1 && day >= 20) || (month == 2 && day <= 18)) {
            horoscope = "Aquarius";
        } else if ((month == 2 && day >= 19) || (month == 3 && day <= 20)) {
            horoscope = "Pisces";
        } else if ((month == 3 && day >= 21) || (month == 4 && day <= 19)) {
            horoscope = "Aries";
        } else if ((month == 4 && day >= 20) || (month == 5 && day <= 20)) {
            horoscope = "Taurus";
        } else if ((month == 5 && day >= 21) || (month == 6 && day <= 20)) {
            horoscope = "Gemini";
        } else if ((month == 6 && day >= 21) || (month == 7 && day <= 22)) {
            horoscope = "Cancer";
        } else if ((month == 7 && day >= 23) || (month == 8 && day <= 22)) {
            horoscope = "Leo";
        } else if ((month == 8 && day >= 23) || (month == 9 && day <= 22)) {
            horoscope = "Virgo";
        } else if ((month == 9 && day >= 23) || (month == 10 && day <= 22)) {
            horoscope = "Libra";
        } else if ((month == 10 && day >= 23) || (month == 11 && day <= 21)) {
            horoscope = "Scorpio";
        } else if ((month == 11 && day >= 22) || (month == 12 && day <= 21)) {
            horoscope = "Sagittarius";
        } else if ((month == 12 && day >= 22) || (month == 1 && day <= 19)) {
            horoscope = "Capricorn";
        } else {
            System.out.println("Invalid date. Please enter a valid month and day.");
            return;
        }
        System.out.println("\nYour zodiac sign is: " + horoscope);
    }
}
