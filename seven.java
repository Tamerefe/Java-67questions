import java.util.Scanner;

public class seven {

    public static void main(String[] args) {

        Scanner sys = new Scanner(System.in);

        System.out.print("Enter 2 numbers: ");

        int fnumb = sys.nextInt();
        int snumb = sys.nextInt();

        if(fnumb > snumb){
            System.out.print(fnumb + " > " + snumb);
        } else if(fnumb == snumb){
            System.out.print(fnumb + " = " + snumb);
        } else if (fnumb < snumb) {
            System.out.print(fnumb + " < " + snumb);
        }

        sys.close();
    }
}
