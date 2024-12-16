public class twentynine {

    public static void main(String[] args) {

        int odd = 0;
        int calc = 0;

        for (int i = 1; i < 11; i++) {
            int randomNumber = 5 + (int) (Math.random() * 146);
            if (randomNumber % 2 == 1) {
                odd += randomNumber;
                calc++;
            }
        }
        System.out.println("Sum of even inside 10 random numbers between 5 and 150 is: " + odd / calc);
    }
}
