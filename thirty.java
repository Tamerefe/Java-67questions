public class thirty {
    public static void main(String[] args) {

        int addrandom = 0;

        for (int i = 1; i < 6; i++) {
            int randomNumber = 100 + (int) (Math.random() * 101);
            addrandom += randomNumber;
        }
        System.out.println("Sum of even inside 5 random numbers between 100 and 200 is: " + addrandom);
    }
}
