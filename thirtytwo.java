import java.util.Random;
import java.util.ArrayList;
import java.util.List;

public class thirtytwo {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> numbers = new ArrayList<>();
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();
        List<Integer> prime = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            int num = random.nextInt(50) + 1;
            numbers.add(num);
            if (num % 2 == 0)
                even.add(num);
            else
                odd.add(num);
            if (isPrime(num))
                prime.add(num);
        }

        System.out.println("Generated Numbers: " + numbers);
        System.out.println("Even Numbers: " + even);
        System.out.println("Odd Numbers: " + odd);
        System.out.println("Prime Numbers: " + prime);
    }

    public static boolean isPrime(int number) {
        if (number < 2)
            return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }
}
