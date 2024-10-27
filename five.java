import java.util.Scanner;

public class five {

    public static void main(String[] args) {

        Scanner sys = new Scanner(System.in);

        System.out.print("Enter 2 numbers: ");

        int fnumb = sys.nextInt();
        int snumb = sys.nextInt();

        int switchnumb = fnumb;
        fnumb = snumb;
        snumb = switchnumb;

        System.out.print("After swapping: "+ fnumb + " " + snumb);

        sys.close();
    }
}
