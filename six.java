import java.util.Scanner;

public class six {

    public static void main(String[] args) {

        Scanner sys = new Scanner(System.in);

        System.out.print("Enter 2 numbers: ");

        int fnumb = sys.nextInt();
        int snumb = sys.nextInt();

        fnumb = fnumb + snumb;
        snumb = fnumb - snumb;
        fnumb = fnumb - snumb;

        System.out.print("After swapping: " + fnumb + " " + snumb);

        sys.close();
    }
}
