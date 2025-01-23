public class thirtyone {
    public static void main(String[] args) {

        System.out.println("30 random numbers: ");
        for (int i = 0; i < 30; i++) {
            int randomNumber = (int) (Math.random() * 100) + 1;

            if (isPrime(randomNumber)) {
                System.out.println("Prime: " + randomNumber);
            } else if (randomNumber % 2 == 0) {
                System.out.println("Even: " + randomNumber);
            }
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i != 0) {
                return false;
            }
        }
        return true;
    }
}